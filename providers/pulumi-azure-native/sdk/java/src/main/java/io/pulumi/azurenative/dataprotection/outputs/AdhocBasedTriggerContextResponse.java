// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.dataprotection.outputs;

import io.pulumi.azurenative.dataprotection.outputs.AdhocBasedTaggingCriteriaResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class AdhocBasedTriggerContextResponse {
    /**
     * Type of the specific object - used for deserializing
     * Expected value is 'AdhocBasedTriggerContext'.
     * 
     */
    private final String objectType;
    /**
     * Tagging Criteria containing retention tag for adhoc backup.
     * 
     */
    private final AdhocBasedTaggingCriteriaResponse taggingCriteria;

    @OutputCustomType.Constructor({"objectType","taggingCriteria"})
    private AdhocBasedTriggerContextResponse(
        String objectType,
        AdhocBasedTaggingCriteriaResponse taggingCriteria) {
        this.objectType = Objects.requireNonNull(objectType);
        this.taggingCriteria = Objects.requireNonNull(taggingCriteria);
    }

    /**
     * Type of the specific object - used for deserializing
     * Expected value is 'AdhocBasedTriggerContext'.
     * 
    */
    public String getObjectType() {
        return this.objectType;
    }
    /**
     * Tagging Criteria containing retention tag for adhoc backup.
     * 
    */
    public AdhocBasedTaggingCriteriaResponse getTaggingCriteria() {
        return this.taggingCriteria;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AdhocBasedTriggerContextResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String objectType;
        private AdhocBasedTaggingCriteriaResponse taggingCriteria;

        public Builder() {
    	      // Empty
        }

        public Builder(AdhocBasedTriggerContextResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.objectType = defaults.objectType;
    	      this.taggingCriteria = defaults.taggingCriteria;
        }

        public Builder setObjectType(String objectType) {
            this.objectType = Objects.requireNonNull(objectType);
            return this;
        }

        public Builder setTaggingCriteria(AdhocBasedTaggingCriteriaResponse taggingCriteria) {
            this.taggingCriteria = Objects.requireNonNull(taggingCriteria);
            return this;
        }
        public AdhocBasedTriggerContextResponse build() {
            return new AdhocBasedTriggerContextResponse(objectType, taggingCriteria);
        }
    }
}