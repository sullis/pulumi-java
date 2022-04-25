// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.customerinsights.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class RelationshipTypeFieldMappingResponse {
    /**
     * @return Specifies the fieldName in profile.
     * 
     */
    private final String profileFieldName;
    /**
     * @return Specifies the KeyProperty (from StrongId) of the related profile.
     * 
     */
    private final String relatedProfileKeyProperty;

    @CustomType.Constructor
    private RelationshipTypeFieldMappingResponse(
        @CustomType.Parameter("profileFieldName") String profileFieldName,
        @CustomType.Parameter("relatedProfileKeyProperty") String relatedProfileKeyProperty) {
        this.profileFieldName = profileFieldName;
        this.relatedProfileKeyProperty = relatedProfileKeyProperty;
    }

    /**
     * @return Specifies the fieldName in profile.
     * 
     */
    public String profileFieldName() {
        return this.profileFieldName;
    }
    /**
     * @return Specifies the KeyProperty (from StrongId) of the related profile.
     * 
     */
    public String relatedProfileKeyProperty() {
        return this.relatedProfileKeyProperty;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RelationshipTypeFieldMappingResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String profileFieldName;
        private String relatedProfileKeyProperty;

        public Builder() {
    	      // Empty
        }

        public Builder(RelationshipTypeFieldMappingResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.profileFieldName = defaults.profileFieldName;
    	      this.relatedProfileKeyProperty = defaults.relatedProfileKeyProperty;
        }

        public Builder profileFieldName(String profileFieldName) {
            this.profileFieldName = Objects.requireNonNull(profileFieldName);
            return this;
        }
        public Builder relatedProfileKeyProperty(String relatedProfileKeyProperty) {
            this.relatedProfileKeyProperty = Objects.requireNonNull(relatedProfileKeyProperty);
            return this;
        }        public RelationshipTypeFieldMappingResponse build() {
            return new RelationshipTypeFieldMappingResponse(profileFieldName, relatedProfileKeyProperty);
        }
    }
}
