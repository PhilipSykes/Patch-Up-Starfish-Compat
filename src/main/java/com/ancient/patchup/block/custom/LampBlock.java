package com.ancient.patchup.block.custom;

import com.ancient.patchup.block.Lamp;
import com.ninni.dye_depot.registry.DDDyes;
import com.starfish_studios.another_furniture.block.properties.ModBlockStateProperties;
import com.starfish_studios.another_furniture.registry.AFItemTags;
import com.starfish_studios.another_furniture.util.block.ShapeUtil;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.ShapeContext;
import net.minecraft.block.Waterloggable;
import net.minecraft.entity.ai.pathing.NavigationType;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.fluid.FluidState;
import net.minecraft.fluid.Fluids;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.BooleanProperty;
import net.minecraft.state.property.DirectionProperty;
import net.minecraft.state.property.IntProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.state.property.Property;
import net.minecraft.util.ActionResult;
import net.minecraft.util.BlockMirror;
import net.minecraft.util.BlockRotation;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import net.minecraft.world.WorldAccess;
import net.minecraft.world.WorldView;
import org.jetbrains.annotations.Nullable;

public class LampBlock extends Block implements Waterloggable {
    protected static final int LEVEL_MIN = 1;
    protected static final int LEVEL_MAX = 3;
    public static final BooleanProperty WATERLOGGED;
    public static final BooleanProperty LIT;
    public static final BooleanProperty POWERED;
    public static final DirectionProperty FACING;
    public static final IntProperty LEVEL;
    public static final BooleanProperty BASE;
    protected static final VoxelShape AABB_UP;
    protected static final VoxelShape AABB_UP_NORMAL;
    protected static final VoxelShape AABB_UP_TOP;
    protected static final VoxelShape AABB_NORTH;
    protected static final VoxelShape AABB_EAST;
    protected static final VoxelShape AABB_SOUTH;
    protected static final VoxelShape AABB_WEST;
    private final DDDyes color;

    public LampBlock(DDDyes color, AbstractBlock.Settings properties) {
        super(properties);
        this.color = color;
        this.setDefaultState((BlockState)((BlockState)((BlockState)((BlockState)((BlockState)((BlockState)((BlockState)this.stateManager.getDefaultState()).with(FACING, Direction.UP)).with(LEVEL, 3)).with(LIT, true)).with(POWERED, false)).with(WATERLOGGED, false)).with(BASE, true));
    }

    public VoxelShape getOutlineShape(BlockState state, BlockView level, BlockPos pos, ShapeContext context) {
        VoxelShape var10000;
        switch ((Direction)state.get(FACING)) {
            case NORTH -> var10000 = AABB_NORTH;
            case EAST -> var10000 = AABB_EAST;
            case SOUTH -> var10000 = AABB_SOUTH;
            case WEST -> var10000 = AABB_WEST;
            default -> var10000 = (Boolean)state.get(BASE) ? AABB_UP_NORMAL : AABB_UP_TOP;
        }

        return var10000;
    }

    public @Nullable BlockState getPlacementState(ItemPlacementContext context) {
        boolean waterlogged = context.getWorld().getFluidState(context.getBlockPos()).getFluid() == Fluids.WATER;
        World level = context.getWorld();
        BlockPos pos = context.getBlockPos();
        Direction clickedFace = context.getSide();
        BlockState blockstate = this.getDefaultState();
        if (level.isReceivingRedstonePower(pos)) {
            blockstate = (BlockState)blockstate.with(POWERED, true);
        }

        return clickedFace != Direction.DOWN ? (BlockState)((BlockState)blockstate.with(FACING, clickedFace)).with(WATERLOGGED, waterlogged) : null;
    }

    public BlockState getStateForNeighborUpdate(BlockState state, Direction direction, BlockState neighborState, WorldAccess level, BlockPos currentPos, BlockPos neighborPos) {
        if (!state.canPlaceAt(level, currentPos)) {
            return Blocks.AIR.getDefaultState();
        } else {
            if ((Boolean)state.get(WATERLOGGED)) {
                level.scheduleFluidTick(currentPos, Fluids.WATER, Fluids.WATER.getTickRate(level));
            }

            if (state.get(FACING) == Direction.UP && (direction == Direction.UP || direction == Direction.DOWN)) {
                BlockState bState;
                boolean var10000;
                label65: {
                    label78: {
                        BlockState aState = level.getBlockState(currentPos.up());
                        bState = level.getBlockState(currentPos.down());
                        Block var12 = aState.getBlock();
                        if (var12 instanceof LampBlock) {
                            LampBlock lampBlock = (LampBlock)var12;
                            if (lampBlock.getColor() == this.getColor() && aState.get(FACING) == Direction.UP) {
                                break label78;
                            }
                        }

                        var12 = aState.getBlock();
                        if (var12 instanceof LampConnectorBlock) {
                            LampConnectorBlock connectorBlock = (LampConnectorBlock)var12;
                            if (connectorBlock.getColor() == this.getColor()) {
                                break label78;
                            }
                        }

                        var10000 = false;
                        break label65;
                    }

                    var10000 = true;
                }

                boolean aConnect;
                label54: {
                    label79: {
                        aConnect = var10000;
                        Block var13 = bState.getBlock();
                        if (var13 instanceof LampBlock) {
                            LampBlock lampBlock = (LampBlock)var13;
                            if (lampBlock.getColor() == this.getColor() && bState.get(FACING) == Direction.UP) {
                                break label79;
                            }
                        }

                        var13 = bState.getBlock();
                        if (var13 instanceof LampConnectorBlock) {
                            LampConnectorBlock connectorBlock = (LampConnectorBlock) var13;
                            if (connectorBlock.getColor() == this.getColor()) {
                                break label79;
                            }
                        }

                        var10000 = false;
                        break label54;
                    }

                    var10000 = true;
                }

                boolean bConnect = var10000;
                if (aConnect && !bConnect) {
                    state = (BlockState)((BlockState)getLampConnectorByColor(this.color).getDefaultState().with(BASE, true)).with(WATERLOGGED, (Boolean)state.get(WATERLOGGED));
                } else if (!aConnect && bConnect) {
                    state = (BlockState)state.with(BASE, false);
                } else if (aConnect) {
                    state = (BlockState)((BlockState)getLampConnectorByColor(this.color).getDefaultState().with(BASE, false)).with(WATERLOGGED, (Boolean)state.get(WATERLOGGED));
                } else {
                    state = (BlockState)state.with(BASE, true);
                }
            }

            return state;
        }
    }

    public FluidState getFluidState(BlockState state) {
        return (Boolean)state.get(WATERLOGGED) ? Fluids.WATER.getStill(false) : super.getFluidState(state);
    }

    public boolean canPlaceAt(BlockState state, WorldView level, BlockPos pos) {
        Direction direction = (Direction)state.get(FACING);
        BlockPos facingPos = pos.offset(direction.getOpposite());
        BlockState facingState = level.getBlockState(facingPos);
        return direction == Direction.UP || facingState.isSideSolidFullSquare(level, facingPos, direction);
    }

    public void neighborUpdate(BlockState state, World level, BlockPos pos, Block block, BlockPos fromPos, boolean isMoving) {
        if (!level.isClient) {
            BlockState below = level.getBlockState(pos.down());
            boolean powered = level.isReceivingRedstonePower(pos) || below.getBlock() instanceof LampConnectorBlock && (Boolean)below.get(POWERED);
            if (powered != (Boolean)state.get(POWERED)) {
                if ((Boolean)state.get(LIT) != powered) {
                    state = (BlockState)state.with(LIT, powered);
                    level.playSound((PlayerEntity)null, pos, SoundEvents.BLOCK_LEVER_CLICK, SoundCategory.BLOCKS, 1.0F, 1.0F);
                }

                state = (BlockState)state.with(POWERED, powered);
            }

            level.setBlockState(pos, state, 3);
        }
    }

    public ActionResult onUse(BlockState state, World level, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
        if (player.getStackInHand(hand).isIn(AFItemTags.LAMPS) && state.get(FACING) == Direction.UP && hit.getSide() == Direction.UP) {
            return ActionResult.FAIL;
        } else {
            if (player.isInSneakingPose()) {
                int light = (Integer)state.get(LEVEL);
                light = light >= 3 ? 1 : light + 1;
                state = (BlockState)state.with(LEVEL, light);
            } else {
                state = (BlockState)state.cycle(LIT);
            }

            level.setBlockState(pos, state, 3);
            level.playSound((PlayerEntity)null, pos, SoundEvents.BLOCK_LEVER_CLICK, SoundCategory.BLOCKS, 1.0F, 1.0F);
            return ActionResult.success(level.isClient);
        }
    }

    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(new Property[]{WATERLOGGED, LIT, POWERED, FACING, LEVEL, BASE});
    }

    public BlockState rotate(BlockState state, BlockRotation rotation) {
        return (BlockState)state.with(FACING, rotation.rotate((Direction)state.get(FACING)));
    }

    public BlockState mirror(BlockState state, BlockMirror mirror) {
        return state.rotate(mirror.getRotation((Direction)state.get(FACING)));
    }

    public boolean canPathfindThrough(BlockState state, BlockView level, BlockPos pos, NavigationType type) {
        return false;
    }

    public DDDyes getColor() {
        return this.color;
    }

    public static Block getLampConnectorByColor(DDDyes color) {
        Block var10000;
        switch (color) {
            case MAROON -> var10000 = (Block) Lamp.MAROON_LAMP_CONNECTOR.get();
            case ROSE -> var10000 = (Block) Lamp.ROSE_LAMP_CONNECTOR.get();
            case CORAL -> var10000 = (Block) Lamp.CORAL_LAMP_CONNECTOR.get();
            case GINGER -> var10000 = (Block) Lamp.GINGER_LAMP_CONNECTOR.get();
            case TAN -> var10000 = (Block) Lamp.TAN_LAMP_CONNECTOR.get();
            case BEIGE -> var10000 = (Block) Lamp.BEIGE_LAMP_CONNECTOR.get();
            case AMBER -> var10000 = (Block) Lamp.AMBER_LAMP_CONNECTOR.get();
            case OLIVE -> var10000 = (Block) Lamp.OLIVE_LAMP_CONNECTOR.get();
            case FOREST -> var10000 = (Block) Lamp.FOREST_LAMP_CONNECTOR.get();
            case VERDANT -> var10000 = (Block) Lamp.VERDANT_LAMP_CONNECTOR.get();
            case TEAL -> var10000 = (Block) Lamp.TEAL_LAMP_CONNECTOR.get();
            case MINT -> var10000 = (Block) Lamp.MINT_LAMP_CONNECTOR.get();
            case AQUA -> var10000 = (Block) Lamp.AQUA_LAMP_CONNECTOR.get();
            case SLATE -> var10000 = (Block) Lamp.SLATE_LAMP_CONNECTOR.get();
            case NAVY -> var10000 = (Block) Lamp.NAVY_LAMP_CONNECTOR.get();
            case INDIGO -> var10000 = (Block) Lamp.INDIGO_LAMP_CONNECTOR.get();
            default -> throw new IncompatibleClassChangeError();
        }

        return var10000;
    }

    static {
        WATERLOGGED = Properties.WATERLOGGED;
        LIT = Properties.LIT;
        POWERED = Properties.POWERED;
        FACING = ModBlockStateProperties.FACING_EXCEPT_DOWN;
        LEVEL = ModBlockStateProperties.LEVEL_1_3;
        BASE = ModBlockStateProperties.BASE;
        AABB_UP = Block.createCuboidShape(3.0, 8.0, 3.0, 13.0, 16.0, 13.0);
        AABB_UP_NORMAL = VoxelShapes.union(AABB_UP, Block.createCuboidShape(5.0, 0.0, 5.0, 11.0, 8.0, 11.0));
        AABB_UP_TOP = VoxelShapes.union(AABB_UP, Block.createCuboidShape(7.0, 0.0, 7.0, 9.0, 8.0, 9.0));
        AABB_NORTH = VoxelShapes.union(Block.createCuboidShape(3.0, 8.0, 5.0, 13.0, 16.0, 15.0), new VoxelShape[]{Block.createCuboidShape(5.0, 0.0, 14.0, 11.0, 6.0, 16.0), Block.createCuboidShape(7.0, 2.0, 9.0, 9.0, 8.0, 11.0), Block.createCuboidShape(7.0, 2.0, 11.0, 9.0, 4.0, 14.0)});
        AABB_EAST = ShapeUtil.rotateShape(AABB_NORTH, Direction.EAST);
        AABB_SOUTH = ShapeUtil.rotateShape(AABB_NORTH, Direction.SOUTH);
        AABB_WEST = ShapeUtil.rotateShape(AABB_NORTH, Direction.WEST);
    }
}