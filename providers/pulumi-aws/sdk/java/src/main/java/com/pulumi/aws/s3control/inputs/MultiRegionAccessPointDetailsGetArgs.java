// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.s3control.inputs;

import com.pulumi.aws.s3control.inputs.MultiRegionAccessPointDetailsPublicAccessBlockGetArgs;
import com.pulumi.aws.s3control.inputs.MultiRegionAccessPointDetailsRegionGetArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class MultiRegionAccessPointDetailsGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final MultiRegionAccessPointDetailsGetArgs Empty = new MultiRegionAccessPointDetailsGetArgs();

    /**
     * The name of the Multi-Region Access Point.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return The name of the Multi-Region Access Point.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     * Configuration block to manage the `PublicAccessBlock` configuration that you want to apply to this Multi-Region Access Point. You can enable the configuration options in any combination. See Public Access Block Configuration below for more details.
     * 
     */
    @Import(name="publicAccessBlock")
    private @Nullable Output<MultiRegionAccessPointDetailsPublicAccessBlockGetArgs> publicAccessBlock;

    /**
     * @return Configuration block to manage the `PublicAccessBlock` configuration that you want to apply to this Multi-Region Access Point. You can enable the configuration options in any combination. See Public Access Block Configuration below for more details.
     * 
     */
    public Optional<Output<MultiRegionAccessPointDetailsPublicAccessBlockGetArgs>> publicAccessBlock() {
        return Optional.ofNullable(this.publicAccessBlock);
    }

    /**
     * The Region configuration block to specify the bucket associated with the Multi-Region Access Point. See Region Configuration below for more details.
     * 
     */
    @Import(name="regions", required=true)
    private Output<List<MultiRegionAccessPointDetailsRegionGetArgs>> regions;

    /**
     * @return The Region configuration block to specify the bucket associated with the Multi-Region Access Point. See Region Configuration below for more details.
     * 
     */
    public Output<List<MultiRegionAccessPointDetailsRegionGetArgs>> regions() {
        return this.regions;
    }

    private MultiRegionAccessPointDetailsGetArgs() {}

    private MultiRegionAccessPointDetailsGetArgs(MultiRegionAccessPointDetailsGetArgs $) {
        this.name = $.name;
        this.publicAccessBlock = $.publicAccessBlock;
        this.regions = $.regions;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(MultiRegionAccessPointDetailsGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MultiRegionAccessPointDetailsGetArgs $;

        public Builder() {
            $ = new MultiRegionAccessPointDetailsGetArgs();
        }

        public Builder(MultiRegionAccessPointDetailsGetArgs defaults) {
            $ = new MultiRegionAccessPointDetailsGetArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name The name of the Multi-Region Access Point.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the Multi-Region Access Point.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param publicAccessBlock Configuration block to manage the `PublicAccessBlock` configuration that you want to apply to this Multi-Region Access Point. You can enable the configuration options in any combination. See Public Access Block Configuration below for more details.
         * 
         * @return builder
         * 
         */
        public Builder publicAccessBlock(@Nullable Output<MultiRegionAccessPointDetailsPublicAccessBlockGetArgs> publicAccessBlock) {
            $.publicAccessBlock = publicAccessBlock;
            return this;
        }

        /**
         * @param publicAccessBlock Configuration block to manage the `PublicAccessBlock` configuration that you want to apply to this Multi-Region Access Point. You can enable the configuration options in any combination. See Public Access Block Configuration below for more details.
         * 
         * @return builder
         * 
         */
        public Builder publicAccessBlock(MultiRegionAccessPointDetailsPublicAccessBlockGetArgs publicAccessBlock) {
            return publicAccessBlock(Output.of(publicAccessBlock));
        }

        /**
         * @param regions The Region configuration block to specify the bucket associated with the Multi-Region Access Point. See Region Configuration below for more details.
         * 
         * @return builder
         * 
         */
        public Builder regions(Output<List<MultiRegionAccessPointDetailsRegionGetArgs>> regions) {
            $.regions = regions;
            return this;
        }

        /**
         * @param regions The Region configuration block to specify the bucket associated with the Multi-Region Access Point. See Region Configuration below for more details.
         * 
         * @return builder
         * 
         */
        public Builder regions(List<MultiRegionAccessPointDetailsRegionGetArgs> regions) {
            return regions(Output.of(regions));
        }

        /**
         * @param regions The Region configuration block to specify the bucket associated with the Multi-Region Access Point. See Region Configuration below for more details.
         * 
         * @return builder
         * 
         */
        public Builder regions(MultiRegionAccessPointDetailsRegionGetArgs... regions) {
            return regions(List.of(regions));
        }

        public MultiRegionAccessPointDetailsGetArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.regions = Objects.requireNonNull($.regions, "expected parameter 'regions' to be non-null");
            return $;
        }
    }

}
