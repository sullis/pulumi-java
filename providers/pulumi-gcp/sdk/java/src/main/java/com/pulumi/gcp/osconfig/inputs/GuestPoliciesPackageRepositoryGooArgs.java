// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.osconfig.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GuestPoliciesPackageRepositoryGooArgs extends com.pulumi.resources.ResourceArgs {

    public static final GuestPoliciesPackageRepositoryGooArgs Empty = new GuestPoliciesPackageRepositoryGooArgs();

    /**
     * Unique identifier for the recipe. Only one recipe with a given name is installed on an instance.
     * Names are also used to identify resources which helps to determine whether guest policies have conflicts.
     * This means that requests to create multiple recipes with the same name and version are rejected since they
     * could potentially have conflicting assignments.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return Unique identifier for the recipe. Only one recipe with a given name is installed on an instance.
     * Names are also used to identify resources which helps to determine whether guest policies have conflicts.
     * This means that requests to create multiple recipes with the same name and version are rejected since they
     * could potentially have conflicting assignments.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     * The url of the repository.
     * 
     */
    @Import(name="url", required=true)
    private Output<String> url;

    /**
     * @return The url of the repository.
     * 
     */
    public Output<String> url() {
        return this.url;
    }

    private GuestPoliciesPackageRepositoryGooArgs() {}

    private GuestPoliciesPackageRepositoryGooArgs(GuestPoliciesPackageRepositoryGooArgs $) {
        this.name = $.name;
        this.url = $.url;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GuestPoliciesPackageRepositoryGooArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GuestPoliciesPackageRepositoryGooArgs $;

        public Builder() {
            $ = new GuestPoliciesPackageRepositoryGooArgs();
        }

        public Builder(GuestPoliciesPackageRepositoryGooArgs defaults) {
            $ = new GuestPoliciesPackageRepositoryGooArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name Unique identifier for the recipe. Only one recipe with a given name is installed on an instance.
         * Names are also used to identify resources which helps to determine whether guest policies have conflicts.
         * This means that requests to create multiple recipes with the same name and version are rejected since they
         * could potentially have conflicting assignments.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Unique identifier for the recipe. Only one recipe with a given name is installed on an instance.
         * Names are also used to identify resources which helps to determine whether guest policies have conflicts.
         * This means that requests to create multiple recipes with the same name and version are rejected since they
         * could potentially have conflicting assignments.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param url The url of the repository.
         * 
         * @return builder
         * 
         */
        public Builder url(Output<String> url) {
            $.url = url;
            return this;
        }

        /**
         * @param url The url of the repository.
         * 
         * @return builder
         * 
         */
        public Builder url(String url) {
            return url(Output.of(url));
        }

        public GuestPoliciesPackageRepositoryGooArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.url = Objects.requireNonNull($.url, "expected parameter 'url' to be non-null");
            return $;
        }
    }

}
