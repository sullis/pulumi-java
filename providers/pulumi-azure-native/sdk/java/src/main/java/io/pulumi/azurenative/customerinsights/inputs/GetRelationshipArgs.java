// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.customerinsights.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetRelationshipArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetRelationshipArgs Empty = new GetRelationshipArgs();

    /**
     * The name of the hub.
     * 
     */
    @Import(name="hubName", required=true)
      private final String hubName;

    public String getHubName() {
        return this.hubName;
    }

    /**
     * The name of the relationship.
     * 
     */
    @Import(name="relationshipName", required=true)
      private final String relationshipName;

    public String getRelationshipName() {
        return this.relationshipName;
    }

    /**
     * The name of the resource group.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final String resourceGroupName;

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    public GetRelationshipArgs(
        String hubName,
        String relationshipName,
        String resourceGroupName) {
        this.hubName = Objects.requireNonNull(hubName, "expected parameter 'hubName' to be non-null");
        this.relationshipName = Objects.requireNonNull(relationshipName, "expected parameter 'relationshipName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
    }

    private GetRelationshipArgs() {
        this.hubName = null;
        this.relationshipName = null;
        this.resourceGroupName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetRelationshipArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String hubName;
        private String relationshipName;
        private String resourceGroupName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetRelationshipArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.hubName = defaults.hubName;
    	      this.relationshipName = defaults.relationshipName;
    	      this.resourceGroupName = defaults.resourceGroupName;
        }

        public Builder hubName(String hubName) {
            this.hubName = Objects.requireNonNull(hubName);
            return this;
        }
        public Builder relationshipName(String relationshipName) {
            this.relationshipName = Objects.requireNonNull(relationshipName);
            return this;
        }
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }        public GetRelationshipArgs build() {
            return new GetRelationshipArgs(hubName, relationshipName, resourceGroupName);
        }
    }
}
