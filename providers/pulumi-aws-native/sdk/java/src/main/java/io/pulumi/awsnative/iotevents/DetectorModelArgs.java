// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iotevents;

import io.pulumi.awsnative.iotevents.enums.DetectorModelEvaluationMethod;
import io.pulumi.awsnative.iotevents.inputs.DetectorModelDefinitionArgs;
import io.pulumi.awsnative.iotevents.inputs.DetectorModelTagArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DetectorModelArgs extends io.pulumi.resources.ResourceArgs {

    public static final DetectorModelArgs Empty = new DetectorModelArgs();

    @Import(name="detectorModelDefinition", required=true)
      private final Output<DetectorModelDefinitionArgs> detectorModelDefinition;

    public Output<DetectorModelDefinitionArgs> detectorModelDefinition() {
        return this.detectorModelDefinition;
    }

    /**
     * A brief description of the detector model.
     * 
     */
    @Import(name="detectorModelDescription")
      private final @Nullable Output<String> detectorModelDescription;

    public Output<String> detectorModelDescription() {
        return this.detectorModelDescription == null ? Codegen.empty() : this.detectorModelDescription;
    }

    /**
     * The name of the detector model.
     * 
     */
    @Import(name="detectorModelName")
      private final @Nullable Output<String> detectorModelName;

    public Output<String> detectorModelName() {
        return this.detectorModelName == null ? Codegen.empty() : this.detectorModelName;
    }

    /**
     * Information about the order in which events are evaluated and how actions are executed.
     * 
     */
    @Import(name="evaluationMethod")
      private final @Nullable Output<DetectorModelEvaluationMethod> evaluationMethod;

    public Output<DetectorModelEvaluationMethod> evaluationMethod() {
        return this.evaluationMethod == null ? Codegen.empty() : this.evaluationMethod;
    }

    /**
     * The value used to identify a detector instance. When a device or system sends input, a new detector instance with a unique key value is created. AWS IoT Events can continue to route input to its corresponding detector instance based on this identifying information.
     * 
     * This parameter uses a JSON-path expression to select the attribute-value pair in the message payload that is used for identification. To route the message to the correct detector instance, the device must send a message payload that contains the same attribute-value.
     * 
     */
    @Import(name="key")
      private final @Nullable Output<String> key;

    public Output<String> key() {
        return this.key == null ? Codegen.empty() : this.key;
    }

    /**
     * The ARN of the role that grants permission to AWS IoT Events to perform its operations.
     * 
     */
    @Import(name="roleArn", required=true)
      private final Output<String> roleArn;

    public Output<String> roleArn() {
        return this.roleArn;
    }

    /**
     * An array of key-value pairs to apply to this resource.
     * 
     * For more information, see [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html).
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<List<DetectorModelTagArgs>> tags;

    public Output<List<DetectorModelTagArgs>> tags() {
        return this.tags == null ? Codegen.empty() : this.tags;
    }

    public DetectorModelArgs(
        Output<DetectorModelDefinitionArgs> detectorModelDefinition,
        @Nullable Output<String> detectorModelDescription,
        @Nullable Output<String> detectorModelName,
        @Nullable Output<DetectorModelEvaluationMethod> evaluationMethod,
        @Nullable Output<String> key,
        Output<String> roleArn,
        @Nullable Output<List<DetectorModelTagArgs>> tags) {
        this.detectorModelDefinition = Objects.requireNonNull(detectorModelDefinition, "expected parameter 'detectorModelDefinition' to be non-null");
        this.detectorModelDescription = detectorModelDescription;
        this.detectorModelName = detectorModelName;
        this.evaluationMethod = evaluationMethod;
        this.key = key;
        this.roleArn = Objects.requireNonNull(roleArn, "expected parameter 'roleArn' to be non-null");
        this.tags = tags;
    }

    private DetectorModelArgs() {
        this.detectorModelDefinition = Codegen.empty();
        this.detectorModelDescription = Codegen.empty();
        this.detectorModelName = Codegen.empty();
        this.evaluationMethod = Codegen.empty();
        this.key = Codegen.empty();
        this.roleArn = Codegen.empty();
        this.tags = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DetectorModelArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<DetectorModelDefinitionArgs> detectorModelDefinition;
        private @Nullable Output<String> detectorModelDescription;
        private @Nullable Output<String> detectorModelName;
        private @Nullable Output<DetectorModelEvaluationMethod> evaluationMethod;
        private @Nullable Output<String> key;
        private Output<String> roleArn;
        private @Nullable Output<List<DetectorModelTagArgs>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(DetectorModelArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.detectorModelDefinition = defaults.detectorModelDefinition;
    	      this.detectorModelDescription = defaults.detectorModelDescription;
    	      this.detectorModelName = defaults.detectorModelName;
    	      this.evaluationMethod = defaults.evaluationMethod;
    	      this.key = defaults.key;
    	      this.roleArn = defaults.roleArn;
    	      this.tags = defaults.tags;
        }

        public Builder detectorModelDefinition(Output<DetectorModelDefinitionArgs> detectorModelDefinition) {
            this.detectorModelDefinition = Objects.requireNonNull(detectorModelDefinition);
            return this;
        }
        public Builder detectorModelDefinition(DetectorModelDefinitionArgs detectorModelDefinition) {
            this.detectorModelDefinition = Output.of(Objects.requireNonNull(detectorModelDefinition));
            return this;
        }
        public Builder detectorModelDescription(@Nullable Output<String> detectorModelDescription) {
            this.detectorModelDescription = detectorModelDescription;
            return this;
        }
        public Builder detectorModelDescription(@Nullable String detectorModelDescription) {
            this.detectorModelDescription = Codegen.ofNullable(detectorModelDescription);
            return this;
        }
        public Builder detectorModelName(@Nullable Output<String> detectorModelName) {
            this.detectorModelName = detectorModelName;
            return this;
        }
        public Builder detectorModelName(@Nullable String detectorModelName) {
            this.detectorModelName = Codegen.ofNullable(detectorModelName);
            return this;
        }
        public Builder evaluationMethod(@Nullable Output<DetectorModelEvaluationMethod> evaluationMethod) {
            this.evaluationMethod = evaluationMethod;
            return this;
        }
        public Builder evaluationMethod(@Nullable DetectorModelEvaluationMethod evaluationMethod) {
            this.evaluationMethod = Codegen.ofNullable(evaluationMethod);
            return this;
        }
        public Builder key(@Nullable Output<String> key) {
            this.key = key;
            return this;
        }
        public Builder key(@Nullable String key) {
            this.key = Codegen.ofNullable(key);
            return this;
        }
        public Builder roleArn(Output<String> roleArn) {
            this.roleArn = Objects.requireNonNull(roleArn);
            return this;
        }
        public Builder roleArn(String roleArn) {
            this.roleArn = Output.of(Objects.requireNonNull(roleArn));
            return this;
        }
        public Builder tags(@Nullable Output<List<DetectorModelTagArgs>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable List<DetectorModelTagArgs> tags) {
            this.tags = Codegen.ofNullable(tags);
            return this;
        }
        public Builder tags(DetectorModelTagArgs... tags) {
            return tags(List.of(tags));
        }        public DetectorModelArgs build() {
            return new DetectorModelArgs(detectorModelDefinition, detectorModelDescription, detectorModelName, evaluationMethod, key, roleArn, tags);
        }
    }
}
