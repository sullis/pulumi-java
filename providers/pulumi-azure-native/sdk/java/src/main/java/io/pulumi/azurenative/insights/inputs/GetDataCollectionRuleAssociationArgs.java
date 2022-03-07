// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.insights.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetDataCollectionRuleAssociationArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetDataCollectionRuleAssociationArgs Empty = new GetDataCollectionRuleAssociationArgs();

    /**
     * The name of the association. The name is case insensitive.
     * 
     */
    @InputImport(name="associationName", required=true)
      private final String associationName;

    public String getAssociationName() {
        return this.associationName;
    }

    /**
     * The identifier of the resource.
     * 
     */
    @InputImport(name="resourceUri", required=true)
      private final String resourceUri;

    public String getResourceUri() {
        return this.resourceUri;
    }

    public GetDataCollectionRuleAssociationArgs(
        String associationName,
        String resourceUri) {
        this.associationName = Objects.requireNonNull(associationName, "expected parameter 'associationName' to be non-null");
        this.resourceUri = Objects.requireNonNull(resourceUri, "expected parameter 'resourceUri' to be non-null");
    }

    private GetDataCollectionRuleAssociationArgs() {
        this.associationName = null;
        this.resourceUri = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDataCollectionRuleAssociationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String associationName;
        private String resourceUri;

        public Builder() {
    	      // Empty
        }

        public Builder(GetDataCollectionRuleAssociationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.associationName = defaults.associationName;
    	      this.resourceUri = defaults.resourceUri;
        }

        public Builder setAssociationName(String associationName) {
            this.associationName = Objects.requireNonNull(associationName);
            return this;
        }

        public Builder setResourceUri(String resourceUri) {
            this.resourceUri = Objects.requireNonNull(resourceUri);
            return this;
        }
        public GetDataCollectionRuleAssociationArgs build() {
            return new GetDataCollectionRuleAssociationArgs(associationName, resourceUri);
        }
    }
}