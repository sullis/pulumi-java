// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.kafkaconnect;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.kafkaconnect.ConnectorArgs;
import io.pulumi.awsnative.kafkaconnect.outputs.ConnectorCapacity;
import io.pulumi.awsnative.kafkaconnect.outputs.ConnectorKafkaCluster;
import io.pulumi.awsnative.kafkaconnect.outputs.ConnectorKafkaClusterClientAuthentication;
import io.pulumi.awsnative.kafkaconnect.outputs.ConnectorKafkaClusterEncryptionInTransit;
import io.pulumi.awsnative.kafkaconnect.outputs.ConnectorLogDelivery;
import io.pulumi.awsnative.kafkaconnect.outputs.ConnectorPlugin;
import io.pulumi.awsnative.kafkaconnect.outputs.ConnectorWorkerConfiguration;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Resource Type definition for AWS::KafkaConnect::Connector
 * 
 */
@ResourceType(type="aws-native:kafkaconnect:Connector")
public class Connector extends io.pulumi.resources.CustomResource {
    @OutputExport(name="capacity", type=ConnectorCapacity.class, parameters={})
    private Output<ConnectorCapacity> capacity;

    public Output<ConnectorCapacity> getCapacity() {
        return this.capacity;
    }
    /**
     * Amazon Resource Name for the created Connector.
     * 
     */
    @OutputExport(name="connectorArn", type=String.class, parameters={})
    private Output<String> connectorArn;

    /**
     * @return Amazon Resource Name for the created Connector.
     * 
     */
    public Output<String> getConnectorArn() {
        return this.connectorArn;
    }
    /**
     * The configuration for the connector.
     * 
     */
    @OutputExport(name="connectorConfiguration", type=Object.class, parameters={})
    private Output<Object> connectorConfiguration;

    /**
     * @return The configuration for the connector.
     * 
     */
    public Output<Object> getConnectorConfiguration() {
        return this.connectorConfiguration;
    }
    /**
     * A summary description of the connector.
     * 
     */
    @OutputExport(name="connectorDescription", type=String.class, parameters={})
    private Output</* @Nullable */ String> connectorDescription;

    /**
     * @return A summary description of the connector.
     * 
     */
    public Output</* @Nullable */ String> getConnectorDescription() {
        return this.connectorDescription;
    }
    /**
     * The name of the connector.
     * 
     */
    @OutputExport(name="connectorName", type=String.class, parameters={})
    private Output<String> connectorName;

    /**
     * @return The name of the connector.
     * 
     */
    public Output<String> getConnectorName() {
        return this.connectorName;
    }
    @OutputExport(name="kafkaCluster", type=ConnectorKafkaCluster.class, parameters={})
    private Output<ConnectorKafkaCluster> kafkaCluster;

    public Output<ConnectorKafkaCluster> getKafkaCluster() {
        return this.kafkaCluster;
    }
    @OutputExport(name="kafkaClusterClientAuthentication", type=ConnectorKafkaClusterClientAuthentication.class, parameters={})
    private Output<ConnectorKafkaClusterClientAuthentication> kafkaClusterClientAuthentication;

    public Output<ConnectorKafkaClusterClientAuthentication> getKafkaClusterClientAuthentication() {
        return this.kafkaClusterClientAuthentication;
    }
    @OutputExport(name="kafkaClusterEncryptionInTransit", type=ConnectorKafkaClusterEncryptionInTransit.class, parameters={})
    private Output<ConnectorKafkaClusterEncryptionInTransit> kafkaClusterEncryptionInTransit;

    public Output<ConnectorKafkaClusterEncryptionInTransit> getKafkaClusterEncryptionInTransit() {
        return this.kafkaClusterEncryptionInTransit;
    }
    /**
     * The version of Kafka Connect. It has to be compatible with both the Kafka cluster's version and the plugins.
     * 
     */
    @OutputExport(name="kafkaConnectVersion", type=String.class, parameters={})
    private Output<String> kafkaConnectVersion;

    /**
     * @return The version of Kafka Connect. It has to be compatible with both the Kafka cluster's version and the plugins.
     * 
     */
    public Output<String> getKafkaConnectVersion() {
        return this.kafkaConnectVersion;
    }
    @OutputExport(name="logDelivery", type=ConnectorLogDelivery.class, parameters={})
    private Output</* @Nullable */ ConnectorLogDelivery> logDelivery;

    public Output</* @Nullable */ ConnectorLogDelivery> getLogDelivery() {
        return this.logDelivery;
    }
    /**
     * List of plugins to use with the connector.
     * 
     */
    @OutputExport(name="plugins", type=List.class, parameters={ConnectorPlugin.class})
    private Output<List<ConnectorPlugin>> plugins;

    /**
     * @return List of plugins to use with the connector.
     * 
     */
    public Output<List<ConnectorPlugin>> getPlugins() {
        return this.plugins;
    }
    /**
     * The Amazon Resource Name (ARN) of the IAM role used by the connector to access Amazon S3 objects and other external resources.
     * 
     */
    @OutputExport(name="serviceExecutionRoleArn", type=String.class, parameters={})
    private Output<String> serviceExecutionRoleArn;

    /**
     * @return The Amazon Resource Name (ARN) of the IAM role used by the connector to access Amazon S3 objects and other external resources.
     * 
     */
    public Output<String> getServiceExecutionRoleArn() {
        return this.serviceExecutionRoleArn;
    }
    @OutputExport(name="workerConfiguration", type=ConnectorWorkerConfiguration.class, parameters={})
    private Output</* @Nullable */ ConnectorWorkerConfiguration> workerConfiguration;

    public Output</* @Nullable */ ConnectorWorkerConfiguration> getWorkerConfiguration() {
        return this.workerConfiguration;
    }

    public interface BuilderApplicator {
        public void apply(ConnectorArgs.Builder a);
    }
    private static io.pulumi.awsnative.kafkaconnect.ConnectorArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.awsnative.kafkaconnect.ConnectorArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public Connector(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Connector(String name) {
        this(name, ConnectorArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Connector(String name, ConnectorArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Connector(String name, ConnectorArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:kafkaconnect:Connector", name, args == null ? ConnectorArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private Connector(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:kafkaconnect:Connector", name, null, makeResourceOptions(options, id));
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
    public static Connector get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Connector(name, id, options);
    }
}