// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.ServiceCatalog.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetPrivateApplicationPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetPrivateApplicationPlainArgs Empty = new GetPrivateApplicationPlainArgs();

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

    private GetPrivateApplicationPlainArgs() {}

    private GetPrivateApplicationPlainArgs(GetPrivateApplicationPlainArgs $) {
        this.privateApplicationId = $.privateApplicationId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetPrivateApplicationPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetPrivateApplicationPlainArgs $;

        public Builder() {
            $ = new GetPrivateApplicationPlainArgs();
        }

        public Builder(GetPrivateApplicationPlainArgs defaults) {
            $ = new GetPrivateApplicationPlainArgs(Objects.requireNonNull(defaults));
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

        public GetPrivateApplicationPlainArgs build() {
            $.privateApplicationId = Objects.requireNonNull($.privateApplicationId, "expected parameter 'privateApplicationId' to be non-null");
            return $;
        }
    }

}
