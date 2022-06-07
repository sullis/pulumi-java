// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.imagebuilder.inputs;

import com.pulumi.aws.imagebuilder.inputs.GetImagePipelinesFilter;
import com.pulumi.core.annotations.Import;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetImagePipelinesPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetImagePipelinesPlainArgs Empty = new GetImagePipelinesPlainArgs();

    /**
     * Configuration block(s) for filtering. Detailed below.
     * 
     */
    @Import(name="filters")
    private @Nullable List<GetImagePipelinesFilter> filters;

    /**
     * @return Configuration block(s) for filtering. Detailed below.
     * 
     */
    public Optional<List<GetImagePipelinesFilter>> filters() {
        return Optional.ofNullable(this.filters);
    }

    private GetImagePipelinesPlainArgs() {}

    private GetImagePipelinesPlainArgs(GetImagePipelinesPlainArgs $) {
        this.filters = $.filters;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetImagePipelinesPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetImagePipelinesPlainArgs $;

        public Builder() {
            $ = new GetImagePipelinesPlainArgs();
        }

        public Builder(GetImagePipelinesPlainArgs defaults) {
            $ = new GetImagePipelinesPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param filters Configuration block(s) for filtering. Detailed below.
         * 
         * @return builder
         * 
         */
        public Builder filters(@Nullable List<GetImagePipelinesFilter> filters) {
            $.filters = filters;
            return this;
        }

        /**
         * @param filters Configuration block(s) for filtering. Detailed below.
         * 
         * @return builder
         * 
         */
        public Builder filters(GetImagePipelinesFilter... filters) {
            return filters(List.of(filters));
        }

        public GetImagePipelinesPlainArgs build() {
            return $;
        }
    }

}
