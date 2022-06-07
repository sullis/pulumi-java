// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.servicecatalog.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetCloudFormationProvisionedProductArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetCloudFormationProvisionedProductArgs Empty = new GetCloudFormationProvisionedProductArgs();

    @Import(name="provisionedProductId", required=true)
    private Output<String> provisionedProductId;

    public Output<String> provisionedProductId() {
        return this.provisionedProductId;
    }

    private GetCloudFormationProvisionedProductArgs() {}

    private GetCloudFormationProvisionedProductArgs(GetCloudFormationProvisionedProductArgs $) {
        this.provisionedProductId = $.provisionedProductId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetCloudFormationProvisionedProductArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetCloudFormationProvisionedProductArgs $;

        public Builder() {
            $ = new GetCloudFormationProvisionedProductArgs();
        }

        public Builder(GetCloudFormationProvisionedProductArgs defaults) {
            $ = new GetCloudFormationProvisionedProductArgs(Objects.requireNonNull(defaults));
        }

        public Builder provisionedProductId(Output<String> provisionedProductId) {
            $.provisionedProductId = provisionedProductId;
            return this;
        }

        public Builder provisionedProductId(String provisionedProductId) {
            return provisionedProductId(Output.of(provisionedProductId));
        }

        public GetCloudFormationProvisionedProductArgs build() {
            $.provisionedProductId = Objects.requireNonNull($.provisionedProductId, "expected parameter 'provisionedProductId' to be non-null");
            return $;
        }
    }

}
