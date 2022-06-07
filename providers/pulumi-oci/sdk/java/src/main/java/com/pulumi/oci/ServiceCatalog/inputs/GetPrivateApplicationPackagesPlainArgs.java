// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.ServiceCatalog.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.oci.ServiceCatalog.inputs.GetPrivateApplicationPackagesFilter;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetPrivateApplicationPackagesPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetPrivateApplicationPackagesPlainArgs Empty = new GetPrivateApplicationPackagesPlainArgs();

    /**
     * Exact match name filter.
     * 
     */
    @Import(name="displayName")
    private @Nullable String displayName;

    /**
     * @return Exact match name filter.
     * 
     */
    public Optional<String> displayName() {
        return Optional.ofNullable(this.displayName);
    }

    @Import(name="filters")
    private @Nullable List<GetPrivateApplicationPackagesFilter> filters;

    public Optional<List<GetPrivateApplicationPackagesFilter>> filters() {
        return Optional.ofNullable(this.filters);
    }

    /**
     * Name of the package type. If multiple package types are provided, then any resource with one or more matching package types will be returned.
     * 
     */
    @Import(name="packageTypes")
    private @Nullable List<String> packageTypes;

    /**
     * @return Name of the package type. If multiple package types are provided, then any resource with one or more matching package types will be returned.
     * 
     */
    public Optional<List<String>> packageTypes() {
        return Optional.ofNullable(this.packageTypes);
    }

    /**
     * The unique identifier for the private application.
     * 
     */
    @Import(name="privateApplicationId", required=true)
    private String privateApplicationId;

    /**
     * @return The unique identifier for the private application.
     * 
     */
    public String privateApplicationId() {
        return this.privateApplicationId;
    }

    /**
     * The unique identifier for the private application package.
     * 
     */
    @Import(name="privateApplicationPackageId")
    private @Nullable String privateApplicationPackageId;

    /**
     * @return The unique identifier for the private application package.
     * 
     */
    public Optional<String> privateApplicationPackageId() {
        return Optional.ofNullable(this.privateApplicationPackageId);
    }

    private GetPrivateApplicationPackagesPlainArgs() {}

    private GetPrivateApplicationPackagesPlainArgs(GetPrivateApplicationPackagesPlainArgs $) {
        this.displayName = $.displayName;
        this.filters = $.filters;
        this.packageTypes = $.packageTypes;
        this.privateApplicationId = $.privateApplicationId;
        this.privateApplicationPackageId = $.privateApplicationPackageId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetPrivateApplicationPackagesPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetPrivateApplicationPackagesPlainArgs $;

        public Builder() {
            $ = new GetPrivateApplicationPackagesPlainArgs();
        }

        public Builder(GetPrivateApplicationPackagesPlainArgs defaults) {
            $ = new GetPrivateApplicationPackagesPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param displayName Exact match name filter.
         * 
         * @return builder
         * 
         */
        public Builder displayName(@Nullable String displayName) {
            $.displayName = displayName;
            return this;
        }

        public Builder filters(@Nullable List<GetPrivateApplicationPackagesFilter> filters) {
            $.filters = filters;
            return this;
        }

        public Builder filters(GetPrivateApplicationPackagesFilter... filters) {
            return filters(List.of(filters));
        }

        /**
         * @param packageTypes Name of the package type. If multiple package types are provided, then any resource with one or more matching package types will be returned.
         * 
         * @return builder
         * 
         */
        public Builder packageTypes(@Nullable List<String> packageTypes) {
            $.packageTypes = packageTypes;
            return this;
        }

        /**
         * @param packageTypes Name of the package type. If multiple package types are provided, then any resource with one or more matching package types will be returned.
         * 
         * @return builder
         * 
         */
        public Builder packageTypes(String... packageTypes) {
            return packageTypes(List.of(packageTypes));
        }

        /**
         * @param privateApplicationId The unique identifier for the private application.
         * 
         * @return builder
         * 
         */
        public Builder privateApplicationId(String privateApplicationId) {
            $.privateApplicationId = privateApplicationId;
            return this;
        }

        /**
         * @param privateApplicationPackageId The unique identifier for the private application package.
         * 
         * @return builder
         * 
         */
        public Builder privateApplicationPackageId(@Nullable String privateApplicationPackageId) {
            $.privateApplicationPackageId = privateApplicationPackageId;
            return this;
        }

        public GetPrivateApplicationPackagesPlainArgs build() {
            $.privateApplicationId = Objects.requireNonNull($.privateApplicationId, "expected parameter 'privateApplicationId' to be non-null");
            return $;
        }
    }

}
