// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.binaryauthorization_v1;

import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.binaryauthorization_v1.AttestorArgs;
import io.pulumi.googlenative.binaryauthorization_v1.outputs.UserOwnedGrafeasNoteResponse;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Creates an attestor, and returns a copy of the new attestor. Returns NOT_FOUND if the project does not exist, INVALID_ARGUMENT if the request is malformed, ALREADY_EXISTS if the attestor already exists.
 * 
 */
@ResourceType(type="google-native:binaryauthorization/v1:Attestor")
public class Attestor extends io.pulumi.resources.CustomResource {
    /**
     * Optional. A descriptive comment. This field may be updated. The field may be displayed in chooser dialogs.
     * 
     */
    @OutputExport(name="description", type=String.class, parameters={})
    private Output<String> description;

    /**
     * @return Optional. A descriptive comment. This field may be updated. The field may be displayed in chooser dialogs.
     * 
     */
    public Output<String> getDescription() {
        return this.description;
    }
    /**
     * The resource name, in the format: `projects/*{@literal /}attestors/*`. This field may not be updated.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The resource name, in the format: `projects/*{@literal /}attestors/*`. This field may not be updated.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * Time when the attestor was last updated.
     * 
     */
    @OutputExport(name="updateTime", type=String.class, parameters={})
    private Output<String> updateTime;

    /**
     * @return Time when the attestor was last updated.
     * 
     */
    public Output<String> getUpdateTime() {
        return this.updateTime;
    }
    /**
     * This specifies how an attestation will be read, and how it will be used during policy enforcement.
     * 
     */
    @OutputExport(name="userOwnedGrafeasNote", type=UserOwnedGrafeasNoteResponse.class, parameters={})
    private Output<UserOwnedGrafeasNoteResponse> userOwnedGrafeasNote;

    /**
     * @return This specifies how an attestation will be read, and how it will be used during policy enforcement.
     * 
     */
    public Output<UserOwnedGrafeasNoteResponse> getUserOwnedGrafeasNote() {
        return this.userOwnedGrafeasNote;
    }

    public interface BuilderApplicator {
        public void apply(AttestorArgs.Builder a);
    }
    private static io.pulumi.googlenative.binaryauthorization_v1.AttestorArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.googlenative.binaryauthorization_v1.AttestorArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public Attestor(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Attestor(String name) {
        this(name, AttestorArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Attestor(String name, AttestorArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Attestor(String name, AttestorArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:binaryauthorization/v1:Attestor", name, args == null ? AttestorArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private Attestor(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:binaryauthorization/v1:Attestor", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
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
    public static Attestor get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Attestor(name, id, options);
    }
}