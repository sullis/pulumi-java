// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.apimanagement.inputs;

import java.util.Objects;


public final class GetApiManagementServiceDomainOwnershipIdentifierArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetApiManagementServiceDomainOwnershipIdentifierArgs Empty = new GetApiManagementServiceDomainOwnershipIdentifierArgs();

    public GetApiManagementServiceDomainOwnershipIdentifierArgs() {
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetApiManagementServiceDomainOwnershipIdentifierArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {

        public Builder() {
    	      // Empty
        }

        public Builder(GetApiManagementServiceDomainOwnershipIdentifierArgs defaults) {
    	      Objects.requireNonNull(defaults);
        }
        public GetApiManagementServiceDomainOwnershipIdentifierArgs build() {
            return new GetApiManagementServiceDomainOwnershipIdentifierArgs();
        }
    }
}