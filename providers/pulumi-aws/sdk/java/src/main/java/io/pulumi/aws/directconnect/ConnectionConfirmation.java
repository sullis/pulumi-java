// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.directconnect;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.directconnect.ConnectionConfirmationArgs;
import io.pulumi.aws.directconnect.inputs.ConnectionConfirmationState;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Provides a confirmation of the creation of the specified hosted connection on an interconnect.
 * 
 * ## Example Usage
 * 
 */
@ResourceType(type="aws:directconnect/connectionConfirmation:ConnectionConfirmation")
public class ConnectionConfirmation extends io.pulumi.resources.CustomResource {
    /**
     * The ID of the hosted connection.
     * 
     */
    @OutputExport(name="connectionId", type=String.class, parameters={})
    private Output<String> connectionId;

    /**
     * @return The ID of the hosted connection.
     * 
     */
    public Output<String> getConnectionId() {
        return this.connectionId;
    }

    public interface BuilderApplicator {
        public void apply(ConnectionConfirmationArgs.Builder a);
    }
    private static io.pulumi.aws.directconnect.ConnectionConfirmationArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.aws.directconnect.ConnectionConfirmationArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public ConnectionConfirmation(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ConnectionConfirmation(String name) {
        this(name, ConnectionConfirmationArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ConnectionConfirmation(String name, ConnectionConfirmationArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ConnectionConfirmation(String name, ConnectionConfirmationArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:directconnect/connectionConfirmation:ConnectionConfirmation", name, args == null ? ConnectionConfirmationArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private ConnectionConfirmation(String name, Input<String> id, @Nullable ConnectionConfirmationState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:directconnect/connectionConfirmation:ConnectionConfirmation", name, state, makeResourceOptions(options, id));
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
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static ConnectionConfirmation get(String name, Input<String> id, @Nullable ConnectionConfirmationState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new ConnectionConfirmation(name, id, state, options);
    }
}