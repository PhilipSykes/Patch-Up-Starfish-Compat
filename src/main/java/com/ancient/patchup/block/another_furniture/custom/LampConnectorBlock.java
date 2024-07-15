package com.ancient.patchup.block.another_furniture.custom;

import com.ancient.patchup.block.another_furniture.Lamp;
import com.ninni.dye_depot.registry.DDDyes;
import com.starfish_studios.another_furniture.block.properties.ModBlockStateProperties;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.block.Waterloggable;
import net.minecraft.fluid.FluidState;
import net.minecraft.fluid.Fluids;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.BooleanProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.state.property.Property;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import net.minecraft.world.WorldAccess;
import org.jetbrains.annotations.Nullable;

public class LampConnectorBlock extends Block implements Waterloggable {
    public static final BooleanProperty WATERLOGGED;
    public static final BooleanProperty POWERED;
    public static final BooleanProperty BASE;
    protected static final VoxelShape AABB_NOT_BASE;
    protected static final VoxelShape AABB_BASE;
    private final DDDyes color;

    public LampConnectorBlock(DDDyes color, AbstractBlock.Settings properties) {
        super(properties);
        this.color = color;
        this.setDefaultState((BlockState)((BlockState)((BlockState)((BlockState)this.stateManager.getDefaultState()).with(POWERED, false)).with(WATERLOGGED, false)).with(BASE, true));
    }

    public VoxelShape getOutlineShape(BlockState state, BlockView level, BlockPos pos, ShapeContext context) {
        return (Boolean)state.get(BASE) ? AABB_BASE : AABB_NOT_BASE;
    }

    public @Nullable BlockState getPlacementState(ItemPlacementContext context) {
        boolean waterlogged = context.getWorld().getFluidState(context.getBlockPos()).getFluid() == Fluids.WATER;
        World level = context.getWorld();
        BlockPos pos = context.getBlockPos();
        BlockState blockstate = this.getDefaultState();
        if (level.isReceivingRedstonePower(pos)) {
            blockstate = (BlockState)blockstate.with(POWERED, true);
        }

        return (BlockState)blockstate.with(WATERLOGGED, waterlogged);
    }

    public BlockState getStateForNeighborUpdate(BlockState state, Direction direction, BlockState neighborState, WorldAccess level, BlockPos currentPos, BlockPos neighborPos) {
        if ((Boolean)state.get(WATERLOGGED)) {
            level.scheduleFluidTick(currentPos, Fluids.WATER, Fluids.WATER.getTickRate(level));
        }

        if (direction == Direction.UP || direction == Direction.DOWN) {
            BlockState bState;
            boolean var10000;
            label62: {
                label72: {
                    BlockState aState = level.getBlockState(currentPos.up());
                    bState = level.getBlockState(currentPos.down());
                    Block var12 = aState.getBlock();
                    if (var12 instanceof LampBlock) {
                        LampBlock lampBlock = (LampBlock)var12;
                        if (lampBlock.getColor() == this.getColor() && aState.get(LampBlock.FACING) == Direction.UP) {
                            break label72;
                        }
                    }

                    var12 = aState.getBlock();
                    if (var12 instanceof LampConnectorBlock) {
                        LampConnectorBlock connectorBlock = (LampConnectorBlock)var12;
                        if (connectorBlock.getColor() == this.getColor()) {
                            break label72;
                        }
                    }

                    var10000 = false;
                    break label62;
                }

                var10000 = true;
            }

            boolean aConnect;
            label51: {
                label73: {
                    aConnect = var10000;
                    Block var13 = bState.getBlock();
                    if (var13 instanceof LampBlock) {
                        LampBlock lampBlock = (LampBlock)var13;
                        if (lampBlock.getColor() == this.getColor() && bState.get(LampBlock.FACING) == Direction.UP) {
                            break label73;
                        }
                    }

                    var13 = bState.getBlock();
                    if (var13 instanceof LampConnectorBlock) {
                        LampConnectorBlock connectorBlock = (LampConnectorBlock)var13;
                        if (connectorBlock.getColor() == this.getColor()) {
                            break label73;
                        }
                    }

                    var10000 = false;
                    break label51;
                }

                var10000 = true;
            }

            boolean bConnect = var10000;
            if (aConnect && !bConnect) {
                state = (BlockState)state.with(BASE, true);
            } else if (!aConnect && bConnect) {
                state = (BlockState)((BlockState)getLampByColor(this.color).getDefaultState().with(BASE, false)).with(WATERLOGGED, (Boolean)state.get(WATERLOGGED));
            } else if (aConnect) {
                state = (BlockState)state.with(BASE, false);
            } else {
                state = (BlockState)((BlockState)getLampByColor(this.color).getDefaultState().with(BASE, true)).with(WATERLOGGED, (Boolean)state.get(WATERLOGGED));
            }
        }

        return state;
    }

    public FluidState getFluidState(BlockState state) {
        return (Boolean)state.get(WATERLOGGED) ? Fluids.WATER.getStill(false) : super.getFluidState(state);
    }

    public void neighborUpdate(BlockState state, World level, BlockPos pos, Block block, BlockPos fromPos, boolean isMoving) {
        if (!level.isClient) {
            BlockState below = level.getBlockState(pos.down());
            boolean powered = level.isReceivingRedstonePower(pos) || below.getBlock() instanceof com.starfish_studios.another_furniture.block.LampConnectorBlock && (Boolean)below.get(POWERED);
            if (powered != (Boolean)state.get(POWERED)) {
                state = (BlockState)state.with(POWERED, powered);
            }

            level.setBlockState(pos, state, 3);
        }
    }

    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(new Property[]{WATERLOGGED, POWERED, BASE});
    }

    public DDDyes getColor() {
        return this.color;
    }

    public static Block getLampByColor(DDDyes color) {
        Block var10000;
        switch (color) {
            case MAROON -> var10000 = (Block) Lamp.MAROON_LAMP.get();
            case ROSE -> var10000 = (Block)Lamp.ROSE_LAMP.get();
            case CORAL -> var10000 = (Block)Lamp.CORAL_LAMP.get();
            case GINGER -> var10000 = (Block)Lamp.GINGER_LAMP.get();
            case TAN -> var10000 = (Block)Lamp.TAN_LAMP.get();
            case BEIGE -> var10000 = (Block)Lamp.BEIGE_LAMP.get();
            case AMBER -> var10000 = (Block)Lamp.AMBER_LAMP.get();
            case OLIVE -> var10000 = (Block)Lamp.OLIVE_LAMP.get();
            case FOREST -> var10000 = (Block)Lamp.FOREST_LAMP.get();
            case VERDANT -> var10000 = (Block)Lamp.VERDANT_LAMP.get();
            case TEAL -> var10000 = (Block)Lamp.TEAL_LAMP.get();
            case MINT -> var10000 = (Block)Lamp.MINT_LAMP.get();
            case AQUA -> var10000 = (Block)Lamp.AQUA_LAMP.get();
            case SLATE -> var10000 = (Block)Lamp.SLATE_LAMP.get();
            case NAVY -> var10000 = (Block)Lamp.NAVY_LAMP.get();
            case INDIGO -> var10000 = (Block)Lamp.INDIGO_LAMP.get();
            default -> throw new IncompatibleClassChangeError();
        }

        return var10000;
    }

    static {
        WATERLOGGED = Properties.WATERLOGGED;
        POWERED = Properties.POWERED;
        BASE = ModBlockStateProperties.BASE;
        AABB_NOT_BASE = Block.createCuboidShape(7.0, 0.0, 7.0, 9.0, 16.0, 9.0);
        AABB_BASE = VoxelShapes.union(Block.createCuboidShape(5.0, 0.0, 5.0, 11.0, 2.0, 11.0), Block.createCuboidShape(7.0, 2.0, 7.0, 9.0, 16.0, 9.0));
    }
}

