// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.orbital;

import com.pulumi.azurenative.orbital.enums.AutoTrackingConfiguration;
import com.pulumi.azurenative.orbital.inputs.ContactProfileLinkArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Double;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ContactProfileArgs extends com.pulumi.resources.ResourceArgs {

    public static final ContactProfileArgs Empty = new ContactProfileArgs();

    /**
     * Auto track configuration.
     * 
     */
    @Import(name="autoTrackingConfiguration")
    private @Nullable Output<AutoTrackingConfiguration> autoTrackingConfiguration;

    /**
     * @return Auto track configuration.
     * 
     */
    public Optional<Output<AutoTrackingConfiguration>> autoTrackingConfiguration() {
        return Optional.ofNullable(this.autoTrackingConfiguration);
    }

    /**
     * Contact Profile Name
     * 
     */
    @Import(name="contactProfileName")
    private @Nullable Output<String> contactProfileName;

    /**
     * @return Contact Profile Name
     * 
     */
    public Optional<Output<String>> contactProfileName() {
        return Optional.ofNullable(this.contactProfileName);
    }

    /**
     * The URI of the Event Hub used for telemetry
     * 
     */
    @Import(name="eventHubUri")
    private @Nullable Output<String> eventHubUri;

    /**
     * @return The URI of the Event Hub used for telemetry
     * 
     */
    public Optional<Output<String>> eventHubUri() {
        return Optional.ofNullable(this.eventHubUri);
    }

    /**
     * Links of the Contact Profile
     * 
     */
    @Import(name="links", required=true)
    private Output<List<ContactProfileLinkArgs>> links;

    /**
     * @return Links of the Contact Profile
     * 
     */
    public Output<List<ContactProfileLinkArgs>> links() {
        return this.links;
    }

    /**
     * The geo-location where the resource lives
     * 
     */
    @Import(name="location")
    private @Nullable Output<String> location;

    /**
     * @return The geo-location where the resource lives
     * 
     */
    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * Minimum viable elevation for the contact in decimal degrees.
     * 
     */
    @Import(name="minimumElevationDegrees")
    private @Nullable Output<Double> minimumElevationDegrees;

    /**
     * @return Minimum viable elevation for the contact in decimal degrees.
     * 
     */
    public Optional<Output<Double>> minimumElevationDegrees() {
        return Optional.ofNullable(this.minimumElevationDegrees);
    }

    /**
     * Minimum viable contact duration in ISO 8601 format.
     * 
     */
    @Import(name="minimumViableContactDuration")
    private @Nullable Output<String> minimumViableContactDuration;

    /**
     * @return Minimum viable contact duration in ISO 8601 format.
     * 
     */
    public Optional<Output<String>> minimumViableContactDuration() {
        return Optional.ofNullable(this.minimumViableContactDuration);
    }

    /**
     * The name of the resource group. The name is case insensitive.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return The name of the resource group. The name is case insensitive.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Resource tags.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return Resource tags.
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private ContactProfileArgs() {}

    private ContactProfileArgs(ContactProfileArgs $) {
        this.autoTrackingConfiguration = $.autoTrackingConfiguration;
        this.contactProfileName = $.contactProfileName;
        this.eventHubUri = $.eventHubUri;
        this.links = $.links;
        this.location = $.location;
        this.minimumElevationDegrees = $.minimumElevationDegrees;
        this.minimumViableContactDuration = $.minimumViableContactDuration;
        this.resourceGroupName = $.resourceGroupName;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ContactProfileArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ContactProfileArgs $;

        public Builder() {
            $ = new ContactProfileArgs();
        }

        public Builder(ContactProfileArgs defaults) {
            $ = new ContactProfileArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param autoTrackingConfiguration Auto track configuration.
         * 
         * @return builder
         * 
         */
        public Builder autoTrackingConfiguration(@Nullable Output<AutoTrackingConfiguration> autoTrackingConfiguration) {
            $.autoTrackingConfiguration = autoTrackingConfiguration;
            return this;
        }

        /**
         * @param autoTrackingConfiguration Auto track configuration.
         * 
         * @return builder
         * 
         */
        public Builder autoTrackingConfiguration(AutoTrackingConfiguration autoTrackingConfiguration) {
            return autoTrackingConfiguration(Output.of(autoTrackingConfiguration));
        }

        /**
         * @param contactProfileName Contact Profile Name
         * 
         * @return builder
         * 
         */
        public Builder contactProfileName(@Nullable Output<String> contactProfileName) {
            $.contactProfileName = contactProfileName;
            return this;
        }

        /**
         * @param contactProfileName Contact Profile Name
         * 
         * @return builder
         * 
         */
        public Builder contactProfileName(String contactProfileName) {
            return contactProfileName(Output.of(contactProfileName));
        }

        /**
         * @param eventHubUri The URI of the Event Hub used for telemetry
         * 
         * @return builder
         * 
         */
        public Builder eventHubUri(@Nullable Output<String> eventHubUri) {
            $.eventHubUri = eventHubUri;
            return this;
        }

        /**
         * @param eventHubUri The URI of the Event Hub used for telemetry
         * 
         * @return builder
         * 
         */
        public Builder eventHubUri(String eventHubUri) {
            return eventHubUri(Output.of(eventHubUri));
        }

        /**
         * @param links Links of the Contact Profile
         * 
         * @return builder
         * 
         */
        public Builder links(Output<List<ContactProfileLinkArgs>> links) {
            $.links = links;
            return this;
        }

        /**
         * @param links Links of the Contact Profile
         * 
         * @return builder
         * 
         */
        public Builder links(List<ContactProfileLinkArgs> links) {
            return links(Output.of(links));
        }

        /**
         * @param links Links of the Contact Profile
         * 
         * @return builder
         * 
         */
        public Builder links(ContactProfileLinkArgs... links) {
            return links(List.of(links));
        }

        /**
         * @param location The geo-location where the resource lives
         * 
         * @return builder
         * 
         */
        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        /**
         * @param location The geo-location where the resource lives
         * 
         * @return builder
         * 
         */
        public Builder location(String location) {
            return location(Output.of(location));
        }

        /**
         * @param minimumElevationDegrees Minimum viable elevation for the contact in decimal degrees.
         * 
         * @return builder
         * 
         */
        public Builder minimumElevationDegrees(@Nullable Output<Double> minimumElevationDegrees) {
            $.minimumElevationDegrees = minimumElevationDegrees;
            return this;
        }

        /**
         * @param minimumElevationDegrees Minimum viable elevation for the contact in decimal degrees.
         * 
         * @return builder
         * 
         */
        public Builder minimumElevationDegrees(Double minimumElevationDegrees) {
            return minimumElevationDegrees(Output.of(minimumElevationDegrees));
        }

        /**
         * @param minimumViableContactDuration Minimum viable contact duration in ISO 8601 format.
         * 
         * @return builder
         * 
         */
        public Builder minimumViableContactDuration(@Nullable Output<String> minimumViableContactDuration) {
            $.minimumViableContactDuration = minimumViableContactDuration;
            return this;
        }

        /**
         * @param minimumViableContactDuration Minimum viable contact duration in ISO 8601 format.
         * 
         * @return builder
         * 
         */
        public Builder minimumViableContactDuration(String minimumViableContactDuration) {
            return minimumViableContactDuration(Output.of(minimumViableContactDuration));
        }

        /**
         * @param resourceGroupName The name of the resource group. The name is case insensitive.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group. The name is case insensitive.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        /**
         * @param tags Resource tags.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags Resource tags.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        public ContactProfileArgs build() {
            $.links = Objects.requireNonNull($.links, "expected parameter 'links' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
