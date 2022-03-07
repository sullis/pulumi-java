// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.customerinsights.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Metadata for a Link's property mapping.
 * 
 */
public final class TypePropertiesMappingResponse extends io.pulumi.resources.InvokeArgs {

    public static final TypePropertiesMappingResponse Empty = new TypePropertiesMappingResponse();

    /**
     * Link type.
     * 
     */
    @InputImport(name="linkType")
      private final @Nullable String linkType;

    public Optional<String> getLinkType() {
        return this.linkType == null ? Optional.empty() : Optional.ofNullable(this.linkType);
    }

    /**
     *  Property name on the source Entity Type.
     * 
     */
    @InputImport(name="sourcePropertyName", required=true)
      private final String sourcePropertyName;

    public String getSourcePropertyName() {
        return this.sourcePropertyName;
    }

    /**
     * Property name on the target Entity Type.
     * 
     */
    @InputImport(name="targetPropertyName", required=true)
      private final String targetPropertyName;

    public String getTargetPropertyName() {
        return this.targetPropertyName;
    }

    public TypePropertiesMappingResponse(
        @Nullable String linkType,
        String sourcePropertyName,
        String targetPropertyName) {
        this.linkType = linkType;
        this.sourcePropertyName = Objects.requireNonNull(sourcePropertyName, "expected parameter 'sourcePropertyName' to be non-null");
        this.targetPropertyName = Objects.requireNonNull(targetPropertyName, "expected parameter 'targetPropertyName' to be non-null");
    }

    private TypePropertiesMappingResponse() {
        this.linkType = null;
        this.sourcePropertyName = null;
        this.targetPropertyName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TypePropertiesMappingResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String linkType;
        private String sourcePropertyName;
        private String targetPropertyName;

        public Builder() {
    	      // Empty
        }

        public Builder(TypePropertiesMappingResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.linkType = defaults.linkType;
    	      this.sourcePropertyName = defaults.sourcePropertyName;
    	      this.targetPropertyName = defaults.targetPropertyName;
        }

        public Builder setLinkType(@Nullable String linkType) {
            this.linkType = linkType;
            return this;
        }

        public Builder setSourcePropertyName(String sourcePropertyName) {
            this.sourcePropertyName = Objects.requireNonNull(sourcePropertyName);
            return this;
        }

        public Builder setTargetPropertyName(String targetPropertyName) {
            this.targetPropertyName = Objects.requireNonNull(targetPropertyName);
            return this;
        }
        public TypePropertiesMappingResponse build() {
            return new TypePropertiesMappingResponse(linkType, sourcePropertyName, targetPropertyName);
        }
    }
}