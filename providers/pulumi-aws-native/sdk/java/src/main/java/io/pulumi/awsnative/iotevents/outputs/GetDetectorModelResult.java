// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iotevents.outputs;

import io.pulumi.awsnative.iotevents.enums.DetectorModelEvaluationMethod;
import io.pulumi.awsnative.iotevents.outputs.DetectorModelDefinition;
import io.pulumi.awsnative.iotevents.outputs.DetectorModelTag;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetDetectorModelResult {
    private final @Nullable DetectorModelDefinition detectorModelDefinition;
    /**
     * A brief description of the detector model.
     * 
     */
    private final @Nullable String detectorModelDescription;
    /**
     * Information about the order in which events are evaluated and how actions are executed.
     * 
     */
    private final @Nullable DetectorModelEvaluationMethod evaluationMethod;
    /**
     * The ARN of the role that grants permission to AWS IoT Events to perform its operations.
     * 
     */
    private final @Nullable String roleArn;
    /**
     * An array of key-value pairs to apply to this resource.
     * 
     * For more information, see [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html).
     * 
     */
    private final @Nullable List<DetectorModelTag> tags;

    @OutputCustomType.Constructor({"detectorModelDefinition","detectorModelDescription","evaluationMethod","roleArn","tags"})
    private GetDetectorModelResult(
        @Nullable DetectorModelDefinition detectorModelDefinition,
        @Nullable String detectorModelDescription,
        @Nullable DetectorModelEvaluationMethod evaluationMethod,
        @Nullable String roleArn,
        @Nullable List<DetectorModelTag> tags) {
        this.detectorModelDefinition = detectorModelDefinition;
        this.detectorModelDescription = detectorModelDescription;
        this.evaluationMethod = evaluationMethod;
        this.roleArn = roleArn;
        this.tags = tags;
    }

    public Optional<DetectorModelDefinition> getDetectorModelDefinition() {
        return Optional.ofNullable(this.detectorModelDefinition);
    }
    /**
     * A brief description of the detector model.
     * 
     */
    public Optional<String> getDetectorModelDescription() {
        return Optional.ofNullable(this.detectorModelDescription);
    }
    /**
     * Information about the order in which events are evaluated and how actions are executed.
     * 
     */
    public Optional<DetectorModelEvaluationMethod> getEvaluationMethod() {
        return Optional.ofNullable(this.evaluationMethod);
    }
    /**
     * The ARN of the role that grants permission to AWS IoT Events to perform its operations.
     * 
     */
    public Optional<String> getRoleArn() {
        return Optional.ofNullable(this.roleArn);
    }
    /**
     * An array of key-value pairs to apply to this resource.
     * 
     * For more information, see [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html).
     * 
     */
    public List<DetectorModelTag> getTags() {
        return this.tags == null ? List.of() : this.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDetectorModelResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable DetectorModelDefinition detectorModelDefinition;
        private @Nullable String detectorModelDescription;
        private @Nullable DetectorModelEvaluationMethod evaluationMethod;
        private @Nullable String roleArn;
        private @Nullable List<DetectorModelTag> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(GetDetectorModelResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.detectorModelDefinition = defaults.detectorModelDefinition;
    	      this.detectorModelDescription = defaults.detectorModelDescription;
    	      this.evaluationMethod = defaults.evaluationMethod;
    	      this.roleArn = defaults.roleArn;
    	      this.tags = defaults.tags;
        }

        public Builder setDetectorModelDefinition(@Nullable DetectorModelDefinition detectorModelDefinition) {
            this.detectorModelDefinition = detectorModelDefinition;
            return this;
        }

        public Builder setDetectorModelDescription(@Nullable String detectorModelDescription) {
            this.detectorModelDescription = detectorModelDescription;
            return this;
        }

        public Builder setEvaluationMethod(@Nullable DetectorModelEvaluationMethod evaluationMethod) {
            this.evaluationMethod = evaluationMethod;
            return this;
        }

        public Builder setRoleArn(@Nullable String roleArn) {
            this.roleArn = roleArn;
            return this;
        }

        public Builder setTags(@Nullable List<DetectorModelTag> tags) {
            this.tags = tags;
            return this;
        }

        public GetDetectorModelResult build() {
            return new GetDetectorModelResult(detectorModelDefinition, detectorModelDescription, evaluationMethod, roleArn, tags);
        }
    }
}
