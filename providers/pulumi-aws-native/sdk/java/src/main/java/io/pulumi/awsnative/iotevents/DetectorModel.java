// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iotevents;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.iotevents.DetectorModelArgs;
import io.pulumi.awsnative.iotevents.enums.DetectorModelEvaluationMethod;
import io.pulumi.awsnative.iotevents.outputs.DetectorModelDefinition;
import io.pulumi.awsnative.iotevents.outputs.DetectorModelTag;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * The AWS::IoTEvents::DetectorModel resource creates a detector model. You create a *detector model* (a model of your equipment or process) using *states*. For each state, you define conditional (Boolean) logic that evaluates the incoming inputs to detect significant events. When an event is detected, it can change the state or trigger custom-built or predefined actions using other AWS services. You can define additional events that trigger actions when entering or exiting a state and, optionally, when a condition is met. For more information, see [How to Use AWS IoT Events](https://docs.aws.amazon.com/iotevents/latest/developerguide/how-to-use-iotevents.html) in the *AWS IoT Events Developer Guide*.
 * 
 */
@ResourceType(type="aws-native:iotevents:DetectorModel")
public class DetectorModel extends io.pulumi.resources.CustomResource {
    @Export(name="detectorModelDefinition", type=DetectorModelDefinition.class, parameters={})
    private Output<DetectorModelDefinition> detectorModelDefinition;

    public Output<DetectorModelDefinition> detectorModelDefinition() {
        return this.detectorModelDefinition;
    }
    /**
     * A brief description of the detector model.
     * 
     */
    @Export(name="detectorModelDescription", type=String.class, parameters={})
    private Output</* @Nullable */ String> detectorModelDescription;

    /**
     * @return A brief description of the detector model.
     * 
     */
    public Output</* @Nullable */ String> detectorModelDescription() {
        return this.detectorModelDescription;
    }
    /**
     * The name of the detector model.
     * 
     */
    @Export(name="detectorModelName", type=String.class, parameters={})
    private Output</* @Nullable */ String> detectorModelName;

    /**
     * @return The name of the detector model.
     * 
     */
    public Output</* @Nullable */ String> detectorModelName() {
        return this.detectorModelName;
    }
    /**
     * Information about the order in which events are evaluated and how actions are executed.
     * 
     */
    @Export(name="evaluationMethod", type=DetectorModelEvaluationMethod.class, parameters={})
    private Output</* @Nullable */ DetectorModelEvaluationMethod> evaluationMethod;

    /**
     * @return Information about the order in which events are evaluated and how actions are executed.
     * 
     */
    public Output</* @Nullable */ DetectorModelEvaluationMethod> evaluationMethod() {
        return this.evaluationMethod;
    }
    /**
     * The value used to identify a detector instance. When a device or system sends input, a new detector instance with a unique key value is created. AWS IoT Events can continue to route input to its corresponding detector instance based on this identifying information.
     * 
     * This parameter uses a JSON-path expression to select the attribute-value pair in the message payload that is used for identification. To route the message to the correct detector instance, the device must send a message payload that contains the same attribute-value.
     * 
     */
    @Export(name="key", type=String.class, parameters={})
    private Output</* @Nullable */ String> key;

    /**
     * @return The value used to identify a detector instance. When a device or system sends input, a new detector instance with a unique key value is created. AWS IoT Events can continue to route input to its corresponding detector instance based on this identifying information.
     * 
     * This parameter uses a JSON-path expression to select the attribute-value pair in the message payload that is used for identification. To route the message to the correct detector instance, the device must send a message payload that contains the same attribute-value.
     * 
     */
    public Output</* @Nullable */ String> key() {
        return this.key;
    }
    /**
     * The ARN of the role that grants permission to AWS IoT Events to perform its operations.
     * 
     */
    @Export(name="roleArn", type=String.class, parameters={})
    private Output<String> roleArn;

    /**
     * @return The ARN of the role that grants permission to AWS IoT Events to perform its operations.
     * 
     */
    public Output<String> roleArn() {
        return this.roleArn;
    }
    /**
     * An array of key-value pairs to apply to this resource.
     * 
     * For more information, see [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html).
     * 
     */
    @Export(name="tags", type=List.class, parameters={DetectorModelTag.class})
    private Output</* @Nullable */ List<DetectorModelTag>> tags;

    /**
     * @return An array of key-value pairs to apply to this resource.
     * 
     * For more information, see [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html).
     * 
     */
    public Output</* @Nullable */ List<DetectorModelTag>> tags() {
        return this.tags;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public DetectorModel(String name) {
        this(name, DetectorModelArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public DetectorModel(String name, DetectorModelArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public DetectorModel(String name, DetectorModelArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:iotevents:DetectorModel", name, args == null ? DetectorModelArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private DetectorModel(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:iotevents:DetectorModel", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static DetectorModel get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new DetectorModel(name, id, options);
    }
}
