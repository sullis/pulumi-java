// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.imagebuilder.inputs;

import com.pulumi.aws.imagebuilder.inputs.GetComponentsFilter;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetComponentsPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetComponentsPlainArgs Empty = new GetComponentsPlainArgs();

    /**
     * Configuration block(s) for filtering. Detailed below.
     * 
     */
    @Import(name="filters")
    private @Nullable List<GetComponentsFilter> filters;

    /**
     * @return Configuration block(s) for filtering. Detailed below.
     * 
     */
    public Optional<List<GetComponentsFilter>> filters() {
        return Optional.ofNullable(this.filters);
    }

    /**
     * The owner of the image recipes. Valid values are `Self`, `Shared` and `Amazon`. Defaults to `Self`.
     * 
     */
    @Import(name="owner")
    private @Nullable String owner;

    /**
     * @return The owner of the image recipes. Valid values are `Self`, `Shared` and `Amazon`. Defaults to `Self`.
     * 
     */
    public Optional<String> owner() {
        return Optional.ofNullable(this.owner);
    }

    private GetComponentsPlainArgs() {}

    private GetComponentsPlainArgs(GetComponentsPlainArgs $) {
        this.filters = $.filters;
        this.owner = $.owner;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetComponentsPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetComponentsPlainArgs $;

        public Builder() {
            $ = new GetComponentsPlainArgs();
        }

        public Builder(GetComponentsPlainArgs defaults) {
            $ = new GetComponentsPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param filters Configuration block(s) for filtering. Detailed below.
         * 
         * @return builder
         * 
         */
        public Builder filters(@Nullable List<GetComponentsFilter> filters) {
            $.filters = filters;
            return this;
        }

        /**
         * @param filters Configuration block(s) for filtering. Detailed below.
         * 
         * @return builder
         * 
         */
        public Builder filters(GetComponentsFilter... filters) {
            return filters(List.of(filters));
        }

        /**
         * @param owner The owner of the image recipes. Valid values are `Self`, `Shared` and `Amazon`. Defaults to `Self`.
         * 
         * @return builder
         * 
         */
        public Builder owner(@Nullable String owner) {
            $.owner = owner;
            return this;
        }

        public GetComponentsPlainArgs build() {
            return $;
        }
    }

}
