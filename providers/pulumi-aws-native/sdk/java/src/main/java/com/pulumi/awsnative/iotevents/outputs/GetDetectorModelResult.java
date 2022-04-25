// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.iotevents.outputs;

import com.pulumi.awsnative.iotevents.enums.DetectorModelEvaluationMethod;
import com.pulumi.awsnative.iotevents.outputs.DetectorModelDefinition;
import com.pulumi.awsnative.iotevents.outputs.DetectorModelTag;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetDetectorModelResult {
    private final @Nullable DetectorModelDefinition detectorModelDefinition;
    /**
     * @return A brief description of the detector model.
     * 
     */
    private final @Nullable String detectorModelDescription;
    /**
     * @return Information about the order in which events are evaluated and how actions are executed.
     * 
     */
    private final @Nullable DetectorModelEvaluationMethod evaluationMethod;
    /**
     * @return The ARN of the role that grants permission to AWS IoT Events to perform its operations.
     * 
     */
    private final @Nullable String roleArn;
    /**
     * @return An array of key-value pairs to apply to this resource.
     * 
     * For more information, see [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html).
     * 
     */
    private final @Nullable List<DetectorModelTag> tags;

    @CustomType.Constructor
    private GetDetectorModelResult(
        @CustomType.Parameter("detectorModelDefinition") @Nullable DetectorModelDefinition detectorModelDefinition,
        @CustomType.Parameter("detectorModelDescription") @Nullable String detectorModelDescription,
        @CustomType.Parameter("evaluationMethod") @Nullable DetectorModelEvaluationMethod evaluationMethod,
        @CustomType.Parameter("roleArn") @Nullable String roleArn,
        @CustomType.Parameter("tags") @Nullable List<DetectorModelTag> tags) {
        this.detectorModelDefinition = detectorModelDefinition;
        this.detectorModelDescription = detectorModelDescription;
        this.evaluationMethod = evaluationMethod;
        this.roleArn = roleArn;
        this.tags = tags;
    }

    public Optional<DetectorModelDefinition> detectorModelDefinition() {
        return Optional.ofNullable(this.detectorModelDefinition);
    }
    /**
     * @return A brief description of the detector model.
     * 
     */
    public Optional<String> detectorModelDescription() {
        return Optional.ofNullable(this.detectorModelDescription);
    }
    /**
     * @return Information about the order in which events are evaluated and how actions are executed.
     * 
     */
    public Optional<DetectorModelEvaluationMethod> evaluationMethod() {
        return Optional.ofNullable(this.evaluationMethod);
    }
    /**
     * @return The ARN of the role that grants permission to AWS IoT Events to perform its operations.
     * 
     */
    public Optional<String> roleArn() {
        return Optional.ofNullable(this.roleArn);
    }
    /**
     * @return An array of key-value pairs to apply to this resource.
     * 
     * For more information, see [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html).
     * 
     */
    public List<DetectorModelTag> tags() {
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

        public Builder detectorModelDefinition(@Nullable DetectorModelDefinition detectorModelDefinition) {
            this.detectorModelDefinition = detectorModelDefinition;
            return this;
        }
        public Builder detectorModelDescription(@Nullable String detectorModelDescription) {
            this.detectorModelDescription = detectorModelDescription;
            return this;
        }
        public Builder evaluationMethod(@Nullable DetectorModelEvaluationMethod evaluationMethod) {
            this.evaluationMethod = evaluationMethod;
            return this;
        }
        public Builder roleArn(@Nullable String roleArn) {
            this.roleArn = roleArn;
            return this;
        }
        public Builder tags(@Nullable List<DetectorModelTag> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(DetectorModelTag... tags) {
            return tags(List.of(tags));
        }        public GetDetectorModelResult build() {
            return new GetDetectorModelResult(detectorModelDefinition, detectorModelDescription, evaluationMethod, roleArn, tags);
        }
    }
}
