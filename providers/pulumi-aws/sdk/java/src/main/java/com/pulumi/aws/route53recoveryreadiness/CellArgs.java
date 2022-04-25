// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.route53recoveryreadiness;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class CellArgs extends com.pulumi.resources.ResourceArgs {

    public static final CellArgs Empty = new CellArgs();

    /**
     * Unique name describing the cell.
     * 
     */
    @Import(name="cellName", required=true)
    private Output<String> cellName;

    /**
     * @return Unique name describing the cell.
     * 
     */
    public Output<String> cellName() {
        return this.cellName;
    }

    /**
     * List of cell arns to add as nested fault domains within this cell.
     * 
     */
    @Import(name="cells")
    private @Nullable Output<List<String>> cells;

    /**
     * @return List of cell arns to add as nested fault domains within this cell.
     * 
     */
    public Optional<Output<List<String>>> cells() {
        return Optional.ofNullable(this.cells);
    }

    /**
     * Key-value mapping of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return Key-value mapping of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private CellArgs() {}

    private CellArgs(CellArgs $) {
        this.cellName = $.cellName;
        this.cells = $.cells;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CellArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CellArgs $;

        public Builder() {
            $ = new CellArgs();
        }

        public Builder(CellArgs defaults) {
            $ = new CellArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param cellName Unique name describing the cell.
         * 
         * @return builder
         * 
         */
        public Builder cellName(Output<String> cellName) {
            $.cellName = cellName;
            return this;
        }

        /**
         * @param cellName Unique name describing the cell.
         * 
         * @return builder
         * 
         */
        public Builder cellName(String cellName) {
            return cellName(Output.of(cellName));
        }

        /**
         * @param cells List of cell arns to add as nested fault domains within this cell.
         * 
         * @return builder
         * 
         */
        public Builder cells(@Nullable Output<List<String>> cells) {
            $.cells = cells;
            return this;
        }

        /**
         * @param cells List of cell arns to add as nested fault domains within this cell.
         * 
         * @return builder
         * 
         */
        public Builder cells(List<String> cells) {
            return cells(Output.of(cells));
        }

        /**
         * @param cells List of cell arns to add as nested fault domains within this cell.
         * 
         * @return builder
         * 
         */
        public Builder cells(String... cells) {
            return cells(List.of(cells));
        }

        /**
         * @param tags Key-value mapping of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags Key-value mapping of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        public CellArgs build() {
            $.cellName = Objects.requireNonNull($.cellName, "expected parameter 'cellName' to be non-null");
            return $;
        }
    }

}
