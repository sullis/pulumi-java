// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.devices.inputs;

import com.pulumi.azurenative.devices.enums.Capabilities;
import com.pulumi.azurenative.devices.enums.PublicNetworkAccess;
import com.pulumi.azurenative.devices.inputs.CloudToDevicePropertiesArgs;
import com.pulumi.azurenative.devices.inputs.EventHubPropertiesArgs;
import com.pulumi.azurenative.devices.inputs.IpFilterRuleArgs;
import com.pulumi.azurenative.devices.inputs.MessagingEndpointPropertiesArgs;
import com.pulumi.azurenative.devices.inputs.NetworkRuleSetPropertiesArgs;
import com.pulumi.azurenative.devices.inputs.PrivateEndpointConnectionArgs;
import com.pulumi.azurenative.devices.inputs.RoutingPropertiesArgs;
import com.pulumi.azurenative.devices.inputs.SharedAccessSignatureAuthorizationRuleArgs;
import com.pulumi.azurenative.devices.inputs.StorageEndpointPropertiesArgs;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The properties of an IoT hub.
 * 
 */
public final class IotHubPropertiesArgs extends com.pulumi.resources.ResourceArgs {

    public static final IotHubPropertiesArgs Empty = new IotHubPropertiesArgs();

    /**
     * The shared access policies you can use to secure a connection to the IoT hub.
     * 
     */
    @Import(name="authorizationPolicies")
    private @Nullable Output<List<SharedAccessSignatureAuthorizationRuleArgs>> authorizationPolicies;

    /**
     * @return The shared access policies you can use to secure a connection to the IoT hub.
     * 
     */
    public Optional<Output<List<SharedAccessSignatureAuthorizationRuleArgs>>> authorizationPolicies() {
        return Optional.ofNullable(this.authorizationPolicies);
    }

    /**
     * The IoT hub cloud-to-device messaging properties.
     * 
     */
    @Import(name="cloudToDevice")
    private @Nullable Output<CloudToDevicePropertiesArgs> cloudToDevice;

    /**
     * @return The IoT hub cloud-to-device messaging properties.
     * 
     */
    public Optional<Output<CloudToDevicePropertiesArgs>> cloudToDevice() {
        return Optional.ofNullable(this.cloudToDevice);
    }

    /**
     * IoT hub comments.
     * 
     */
    @Import(name="comments")
    private @Nullable Output<String> comments;

    /**
     * @return IoT hub comments.
     * 
     */
    public Optional<Output<String>> comments() {
        return Optional.ofNullable(this.comments);
    }

    /**
     * If True, file upload notifications are enabled.
     * 
     */
    @Import(name="enableFileUploadNotifications")
    private @Nullable Output<Boolean> enableFileUploadNotifications;

    /**
     * @return If True, file upload notifications are enabled.
     * 
     */
    public Optional<Output<Boolean>> enableFileUploadNotifications() {
        return Optional.ofNullable(this.enableFileUploadNotifications);
    }

    /**
     * The Event Hub-compatible endpoint properties. The only possible keys to this dictionary is events. This key has to be present in the dictionary while making create or update calls for the IoT hub.
     * 
     */
    @Import(name="eventHubEndpoints")
    private @Nullable Output<Map<String,EventHubPropertiesArgs>> eventHubEndpoints;

    /**
     * @return The Event Hub-compatible endpoint properties. The only possible keys to this dictionary is events. This key has to be present in the dictionary while making create or update calls for the IoT hub.
     * 
     */
    public Optional<Output<Map<String,EventHubPropertiesArgs>>> eventHubEndpoints() {
        return Optional.ofNullable(this.eventHubEndpoints);
    }

    /**
     * The capabilities and features enabled for the IoT hub.
     * 
     */
    @Import(name="features")
    private @Nullable Output<Either<String,Capabilities>> features;

    /**
     * @return The capabilities and features enabled for the IoT hub.
     * 
     */
    public Optional<Output<Either<String,Capabilities>>> features() {
        return Optional.ofNullable(this.features);
    }

    /**
     * The IP filter rules.
     * 
     */
    @Import(name="ipFilterRules")
    private @Nullable Output<List<IpFilterRuleArgs>> ipFilterRules;

    /**
     * @return The IP filter rules.
     * 
     */
    public Optional<Output<List<IpFilterRuleArgs>>> ipFilterRules() {
        return Optional.ofNullable(this.ipFilterRules);
    }

    /**
     * The messaging endpoint properties for the file upload notification queue.
     * 
     */
    @Import(name="messagingEndpoints")
    private @Nullable Output<Map<String,MessagingEndpointPropertiesArgs>> messagingEndpoints;

    /**
     * @return The messaging endpoint properties for the file upload notification queue.
     * 
     */
    public Optional<Output<Map<String,MessagingEndpointPropertiesArgs>>> messagingEndpoints() {
        return Optional.ofNullable(this.messagingEndpoints);
    }

    /**
     * Specifies the minimum TLS version to support for this hub. Can be set to &#34;1.2&#34; to have clients that use a TLS version below 1.2 to be rejected.
     * 
     */
    @Import(name="minTlsVersion")
    private @Nullable Output<String> minTlsVersion;

    /**
     * @return Specifies the minimum TLS version to support for this hub. Can be set to &#34;1.2&#34; to have clients that use a TLS version below 1.2 to be rejected.
     * 
     */
    public Optional<Output<String>> minTlsVersion() {
        return Optional.ofNullable(this.minTlsVersion);
    }

    /**
     * Network Rule Set Properties of IotHub
     * 
     */
    @Import(name="networkRuleSets")
    private @Nullable Output<NetworkRuleSetPropertiesArgs> networkRuleSets;

    /**
     * @return Network Rule Set Properties of IotHub
     * 
     */
    public Optional<Output<NetworkRuleSetPropertiesArgs>> networkRuleSets() {
        return Optional.ofNullable(this.networkRuleSets);
    }

    /**
     * Private endpoint connections created on this IotHub
     * 
     */
    @Import(name="privateEndpointConnections")
    private @Nullable Output<List<PrivateEndpointConnectionArgs>> privateEndpointConnections;

    /**
     * @return Private endpoint connections created on this IotHub
     * 
     */
    public Optional<Output<List<PrivateEndpointConnectionArgs>>> privateEndpointConnections() {
        return Optional.ofNullable(this.privateEndpointConnections);
    }

    /**
     * Whether requests from Public Network are allowed
     * 
     */
    @Import(name="publicNetworkAccess")
    private @Nullable Output<Either<String,PublicNetworkAccess>> publicNetworkAccess;

    /**
     * @return Whether requests from Public Network are allowed
     * 
     */
    public Optional<Output<Either<String,PublicNetworkAccess>>> publicNetworkAccess() {
        return Optional.ofNullable(this.publicNetworkAccess);
    }

    /**
     * The routing related properties of the IoT hub. See: https://docs.microsoft.com/azure/iot-hub/iot-hub-devguide-messaging
     * 
     */
    @Import(name="routing")
    private @Nullable Output<RoutingPropertiesArgs> routing;

    /**
     * @return The routing related properties of the IoT hub. See: https://docs.microsoft.com/azure/iot-hub/iot-hub-devguide-messaging
     * 
     */
    public Optional<Output<RoutingPropertiesArgs>> routing() {
        return Optional.ofNullable(this.routing);
    }

    /**
     * The list of Azure Storage endpoints where you can upload files. Currently you can configure only one Azure Storage account and that MUST have its key as $default. Specifying more than one storage account causes an error to be thrown. Not specifying a value for this property when the enableFileUploadNotifications property is set to True, causes an error to be thrown.
     * 
     */
    @Import(name="storageEndpoints")
    private @Nullable Output<Map<String,StorageEndpointPropertiesArgs>> storageEndpoints;

    /**
     * @return The list of Azure Storage endpoints where you can upload files. Currently you can configure only one Azure Storage account and that MUST have its key as $default. Specifying more than one storage account causes an error to be thrown. Not specifying a value for this property when the enableFileUploadNotifications property is set to True, causes an error to be thrown.
     * 
     */
    public Optional<Output<Map<String,StorageEndpointPropertiesArgs>>> storageEndpoints() {
        return Optional.ofNullable(this.storageEndpoints);
    }

    private IotHubPropertiesArgs() {}

    private IotHubPropertiesArgs(IotHubPropertiesArgs $) {
        this.authorizationPolicies = $.authorizationPolicies;
        this.cloudToDevice = $.cloudToDevice;
        this.comments = $.comments;
        this.enableFileUploadNotifications = $.enableFileUploadNotifications;
        this.eventHubEndpoints = $.eventHubEndpoints;
        this.features = $.features;
        this.ipFilterRules = $.ipFilterRules;
        this.messagingEndpoints = $.messagingEndpoints;
        this.minTlsVersion = $.minTlsVersion;
        this.networkRuleSets = $.networkRuleSets;
        this.privateEndpointConnections = $.privateEndpointConnections;
        this.publicNetworkAccess = $.publicNetworkAccess;
        this.routing = $.routing;
        this.storageEndpoints = $.storageEndpoints;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(IotHubPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private IotHubPropertiesArgs $;

        public Builder() {
            $ = new IotHubPropertiesArgs();
        }

        public Builder(IotHubPropertiesArgs defaults) {
            $ = new IotHubPropertiesArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param authorizationPolicies The shared access policies you can use to secure a connection to the IoT hub.
         * 
         * @return builder
         * 
         */
        public Builder authorizationPolicies(@Nullable Output<List<SharedAccessSignatureAuthorizationRuleArgs>> authorizationPolicies) {
            $.authorizationPolicies = authorizationPolicies;
            return this;
        }

        /**
         * @param authorizationPolicies The shared access policies you can use to secure a connection to the IoT hub.
         * 
         * @return builder
         * 
         */
        public Builder authorizationPolicies(List<SharedAccessSignatureAuthorizationRuleArgs> authorizationPolicies) {
            return authorizationPolicies(Output.of(authorizationPolicies));
        }

        /**
         * @param authorizationPolicies The shared access policies you can use to secure a connection to the IoT hub.
         * 
         * @return builder
         * 
         */
        public Builder authorizationPolicies(SharedAccessSignatureAuthorizationRuleArgs... authorizationPolicies) {
            return authorizationPolicies(List.of(authorizationPolicies));
        }

        /**
         * @param cloudToDevice The IoT hub cloud-to-device messaging properties.
         * 
         * @return builder
         * 
         */
        public Builder cloudToDevice(@Nullable Output<CloudToDevicePropertiesArgs> cloudToDevice) {
            $.cloudToDevice = cloudToDevice;
            return this;
        }

        /**
         * @param cloudToDevice The IoT hub cloud-to-device messaging properties.
         * 
         * @return builder
         * 
         */
        public Builder cloudToDevice(CloudToDevicePropertiesArgs cloudToDevice) {
            return cloudToDevice(Output.of(cloudToDevice));
        }

        /**
         * @param comments IoT hub comments.
         * 
         * @return builder
         * 
         */
        public Builder comments(@Nullable Output<String> comments) {
            $.comments = comments;
            return this;
        }

        /**
         * @param comments IoT hub comments.
         * 
         * @return builder
         * 
         */
        public Builder comments(String comments) {
            return comments(Output.of(comments));
        }

        /**
         * @param enableFileUploadNotifications If True, file upload notifications are enabled.
         * 
         * @return builder
         * 
         */
        public Builder enableFileUploadNotifications(@Nullable Output<Boolean> enableFileUploadNotifications) {
            $.enableFileUploadNotifications = enableFileUploadNotifications;
            return this;
        }

        /**
         * @param enableFileUploadNotifications If True, file upload notifications are enabled.
         * 
         * @return builder
         * 
         */
        public Builder enableFileUploadNotifications(Boolean enableFileUploadNotifications) {
            return enableFileUploadNotifications(Output.of(enableFileUploadNotifications));
        }

        /**
         * @param eventHubEndpoints The Event Hub-compatible endpoint properties. The only possible keys to this dictionary is events. This key has to be present in the dictionary while making create or update calls for the IoT hub.
         * 
         * @return builder
         * 
         */
        public Builder eventHubEndpoints(@Nullable Output<Map<String,EventHubPropertiesArgs>> eventHubEndpoints) {
            $.eventHubEndpoints = eventHubEndpoints;
            return this;
        }

        /**
         * @param eventHubEndpoints The Event Hub-compatible endpoint properties. The only possible keys to this dictionary is events. This key has to be present in the dictionary while making create or update calls for the IoT hub.
         * 
         * @return builder
         * 
         */
        public Builder eventHubEndpoints(Map<String,EventHubPropertiesArgs> eventHubEndpoints) {
            return eventHubEndpoints(Output.of(eventHubEndpoints));
        }

        /**
         * @param features The capabilities and features enabled for the IoT hub.
         * 
         * @return builder
         * 
         */
        public Builder features(@Nullable Output<Either<String,Capabilities>> features) {
            $.features = features;
            return this;
        }

        /**
         * @param features The capabilities and features enabled for the IoT hub.
         * 
         * @return builder
         * 
         */
        public Builder features(Either<String,Capabilities> features) {
            return features(Output.of(features));
        }

        /**
         * @param features The capabilities and features enabled for the IoT hub.
         * 
         * @return builder
         * 
         */
        public Builder features(String features) {
            return features(Either.ofLeft(features));
        }

        /**
         * @param features The capabilities and features enabled for the IoT hub.
         * 
         * @return builder
         * 
         */
        public Builder features(Capabilities features) {
            return features(Either.ofRight(features));
        }

        /**
         * @param ipFilterRules The IP filter rules.
         * 
         * @return builder
         * 
         */
        public Builder ipFilterRules(@Nullable Output<List<IpFilterRuleArgs>> ipFilterRules) {
            $.ipFilterRules = ipFilterRules;
            return this;
        }

        /**
         * @param ipFilterRules The IP filter rules.
         * 
         * @return builder
         * 
         */
        public Builder ipFilterRules(List<IpFilterRuleArgs> ipFilterRules) {
            return ipFilterRules(Output.of(ipFilterRules));
        }

        /**
         * @param ipFilterRules The IP filter rules.
         * 
         * @return builder
         * 
         */
        public Builder ipFilterRules(IpFilterRuleArgs... ipFilterRules) {
            return ipFilterRules(List.of(ipFilterRules));
        }

        /**
         * @param messagingEndpoints The messaging endpoint properties for the file upload notification queue.
         * 
         * @return builder
         * 
         */
        public Builder messagingEndpoints(@Nullable Output<Map<String,MessagingEndpointPropertiesArgs>> messagingEndpoints) {
            $.messagingEndpoints = messagingEndpoints;
            return this;
        }

        /**
         * @param messagingEndpoints The messaging endpoint properties for the file upload notification queue.
         * 
         * @return builder
         * 
         */
        public Builder messagingEndpoints(Map<String,MessagingEndpointPropertiesArgs> messagingEndpoints) {
            return messagingEndpoints(Output.of(messagingEndpoints));
        }

        /**
         * @param minTlsVersion Specifies the minimum TLS version to support for this hub. Can be set to &#34;1.2&#34; to have clients that use a TLS version below 1.2 to be rejected.
         * 
         * @return builder
         * 
         */
        public Builder minTlsVersion(@Nullable Output<String> minTlsVersion) {
            $.minTlsVersion = minTlsVersion;
            return this;
        }

        /**
         * @param minTlsVersion Specifies the minimum TLS version to support for this hub. Can be set to &#34;1.2&#34; to have clients that use a TLS version below 1.2 to be rejected.
         * 
         * @return builder
         * 
         */
        public Builder minTlsVersion(String minTlsVersion) {
            return minTlsVersion(Output.of(minTlsVersion));
        }

        /**
         * @param networkRuleSets Network Rule Set Properties of IotHub
         * 
         * @return builder
         * 
         */
        public Builder networkRuleSets(@Nullable Output<NetworkRuleSetPropertiesArgs> networkRuleSets) {
            $.networkRuleSets = networkRuleSets;
            return this;
        }

        /**
         * @param networkRuleSets Network Rule Set Properties of IotHub
         * 
         * @return builder
         * 
         */
        public Builder networkRuleSets(NetworkRuleSetPropertiesArgs networkRuleSets) {
            return networkRuleSets(Output.of(networkRuleSets));
        }

        /**
         * @param privateEndpointConnections Private endpoint connections created on this IotHub
         * 
         * @return builder
         * 
         */
        public Builder privateEndpointConnections(@Nullable Output<List<PrivateEndpointConnectionArgs>> privateEndpointConnections) {
            $.privateEndpointConnections = privateEndpointConnections;
            return this;
        }

        /**
         * @param privateEndpointConnections Private endpoint connections created on this IotHub
         * 
         * @return builder
         * 
         */
        public Builder privateEndpointConnections(List<PrivateEndpointConnectionArgs> privateEndpointConnections) {
            return privateEndpointConnections(Output.of(privateEndpointConnections));
        }

        /**
         * @param privateEndpointConnections Private endpoint connections created on this IotHub
         * 
         * @return builder
         * 
         */
        public Builder privateEndpointConnections(PrivateEndpointConnectionArgs... privateEndpointConnections) {
            return privateEndpointConnections(List.of(privateEndpointConnections));
        }

        /**
         * @param publicNetworkAccess Whether requests from Public Network are allowed
         * 
         * @return builder
         * 
         */
        public Builder publicNetworkAccess(@Nullable Output<Either<String,PublicNetworkAccess>> publicNetworkAccess) {
            $.publicNetworkAccess = publicNetworkAccess;
            return this;
        }

        /**
         * @param publicNetworkAccess Whether requests from Public Network are allowed
         * 
         * @return builder
         * 
         */
        public Builder publicNetworkAccess(Either<String,PublicNetworkAccess> publicNetworkAccess) {
            return publicNetworkAccess(Output.of(publicNetworkAccess));
        }

        /**
         * @param publicNetworkAccess Whether requests from Public Network are allowed
         * 
         * @return builder
         * 
         */
        public Builder publicNetworkAccess(String publicNetworkAccess) {
            return publicNetworkAccess(Either.ofLeft(publicNetworkAccess));
        }

        /**
         * @param publicNetworkAccess Whether requests from Public Network are allowed
         * 
         * @return builder
         * 
         */
        public Builder publicNetworkAccess(PublicNetworkAccess publicNetworkAccess) {
            return publicNetworkAccess(Either.ofRight(publicNetworkAccess));
        }

        /**
         * @param routing The routing related properties of the IoT hub. See: https://docs.microsoft.com/azure/iot-hub/iot-hub-devguide-messaging
         * 
         * @return builder
         * 
         */
        public Builder routing(@Nullable Output<RoutingPropertiesArgs> routing) {
            $.routing = routing;
            return this;
        }

        /**
         * @param routing The routing related properties of the IoT hub. See: https://docs.microsoft.com/azure/iot-hub/iot-hub-devguide-messaging
         * 
         * @return builder
         * 
         */
        public Builder routing(RoutingPropertiesArgs routing) {
            return routing(Output.of(routing));
        }

        /**
         * @param storageEndpoints The list of Azure Storage endpoints where you can upload files. Currently you can configure only one Azure Storage account and that MUST have its key as $default. Specifying more than one storage account causes an error to be thrown. Not specifying a value for this property when the enableFileUploadNotifications property is set to True, causes an error to be thrown.
         * 
         * @return builder
         * 
         */
        public Builder storageEndpoints(@Nullable Output<Map<String,StorageEndpointPropertiesArgs>> storageEndpoints) {
            $.storageEndpoints = storageEndpoints;
            return this;
        }

        /**
         * @param storageEndpoints The list of Azure Storage endpoints where you can upload files. Currently you can configure only one Azure Storage account and that MUST have its key as $default. Specifying more than one storage account causes an error to be thrown. Not specifying a value for this property when the enableFileUploadNotifications property is set to True, causes an error to be thrown.
         * 
         * @return builder
         * 
         */
        public Builder storageEndpoints(Map<String,StorageEndpointPropertiesArgs> storageEndpoints) {
            return storageEndpoints(Output.of(storageEndpoints));
        }

        public IotHubPropertiesArgs build() {
            return $;
        }
    }

}
