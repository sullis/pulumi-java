// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.insights;

import com.pulumi.azurenative.insights.enums.WebTestKind;
import com.pulumi.azurenative.insights.inputs.WebTestGeolocationArgs;
import com.pulumi.azurenative.insights.inputs.WebTestPropertiesConfigurationArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class WebTestArgs extends com.pulumi.resources.ResourceArgs {

    public static final WebTestArgs Empty = new WebTestArgs();

    /**
     * An XML configuration specification for a WebTest.
     * 
     */
    @Import(name="configuration")
    private @Nullable Output<WebTestPropertiesConfigurationArgs> configuration;

    /**
     * @return An XML configuration specification for a WebTest.
     * 
     */
    public Optional<Output<WebTestPropertiesConfigurationArgs>> configuration() {
        return Optional.ofNullable(this.configuration);
    }

    /**
     * Purpose/user defined descriptive test for this WebTest.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return Purpose/user defined descriptive test for this WebTest.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Is the test actively being monitored.
     * 
     */
    @Import(name="enabled")
    private @Nullable Output<Boolean> enabled;

    /**
     * @return Is the test actively being monitored.
     * 
     */
    public Optional<Output<Boolean>> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    /**
     * Interval in seconds between test runs for this WebTest. Default value is 300.
     * 
     */
    @Import(name="frequency")
    private @Nullable Output<Integer> frequency;

    /**
     * @return Interval in seconds between test runs for this WebTest. Default value is 300.
     * 
     */
    public Optional<Output<Integer>> frequency() {
        return Optional.ofNullable(this.frequency);
    }

    /**
     * The kind of web test that this web test watches. Choices are ping and multistep.
     * 
     */
    @Import(name="kind")
    private @Nullable Output<WebTestKind> kind;

    /**
     * @return The kind of web test that this web test watches. Choices are ping and multistep.
     * 
     */
    public Optional<Output<WebTestKind>> kind() {
        return Optional.ofNullable(this.kind);
    }

    /**
     * Resource location
     * 
     */
    @Import(name="location")
    private @Nullable Output<String> location;

    /**
     * @return Resource location
     * 
     */
    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * A list of where to physically run the tests from to give global coverage for accessibility of your application.
     * 
     */
    @Import(name="locations", required=true)
    private Output<List<WebTestGeolocationArgs>> locations;

    /**
     * @return A list of where to physically run the tests from to give global coverage for accessibility of your application.
     * 
     */
    public Output<List<WebTestGeolocationArgs>> locations() {
        return this.locations;
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
     * Allow for retries should this WebTest fail.
     * 
     */
    @Import(name="retryEnabled")
    private @Nullable Output<Boolean> retryEnabled;

    /**
     * @return Allow for retries should this WebTest fail.
     * 
     */
    public Optional<Output<Boolean>> retryEnabled() {
        return Optional.ofNullable(this.retryEnabled);
    }

    /**
     * Unique ID of this WebTest. This is typically the same value as the Name field.
     * 
     */
    @Import(name="syntheticMonitorId", required=true)
    private Output<String> syntheticMonitorId;

    /**
     * @return Unique ID of this WebTest. This is typically the same value as the Name field.
     * 
     */
    public Output<String> syntheticMonitorId() {
        return this.syntheticMonitorId;
    }

    /**
     * Resource tags
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return Resource tags
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * Seconds until this WebTest will timeout and fail. Default value is 30.
     * 
     */
    @Import(name="timeout")
    private @Nullable Output<Integer> timeout;

    /**
     * @return Seconds until this WebTest will timeout and fail. Default value is 30.
     * 
     */
    public Optional<Output<Integer>> timeout() {
        return Optional.ofNullable(this.timeout);
    }

    /**
     * The kind of web test this is, valid choices are ping and multistep.
     * 
     */
    @Import(name="webTestKind", required=true)
    private Output<WebTestKind> webTestKind;

    /**
     * @return The kind of web test this is, valid choices are ping and multistep.
     * 
     */
    public Output<WebTestKind> webTestKind() {
        return this.webTestKind;
    }

    /**
     * User defined name if this WebTest.
     * 
     */
    @Import(name="webTestName")
    private @Nullable Output<String> webTestName;

    /**
     * @return User defined name if this WebTest.
     * 
     */
    public Optional<Output<String>> webTestName() {
        return Optional.ofNullable(this.webTestName);
    }

    private WebTestArgs() {}

    private WebTestArgs(WebTestArgs $) {
        this.configuration = $.configuration;
        this.description = $.description;
        this.enabled = $.enabled;
        this.frequency = $.frequency;
        this.kind = $.kind;
        this.location = $.location;
        this.locations = $.locations;
        this.resourceGroupName = $.resourceGroupName;
        this.retryEnabled = $.retryEnabled;
        this.syntheticMonitorId = $.syntheticMonitorId;
        this.tags = $.tags;
        this.timeout = $.timeout;
        this.webTestKind = $.webTestKind;
        this.webTestName = $.webTestName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WebTestArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WebTestArgs $;

        public Builder() {
            $ = new WebTestArgs();
        }

        public Builder(WebTestArgs defaults) {
            $ = new WebTestArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param configuration An XML configuration specification for a WebTest.
         * 
         * @return builder
         * 
         */
        public Builder configuration(@Nullable Output<WebTestPropertiesConfigurationArgs> configuration) {
            $.configuration = configuration;
            return this;
        }

        /**
         * @param configuration An XML configuration specification for a WebTest.
         * 
         * @return builder
         * 
         */
        public Builder configuration(WebTestPropertiesConfigurationArgs configuration) {
            return configuration(Output.of(configuration));
        }

        /**
         * @param description Purpose/user defined descriptive test for this WebTest.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description Purpose/user defined descriptive test for this WebTest.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param enabled Is the test actively being monitored.
         * 
         * @return builder
         * 
         */
        public Builder enabled(@Nullable Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        /**
         * @param enabled Is the test actively being monitored.
         * 
         * @return builder
         * 
         */
        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        /**
         * @param frequency Interval in seconds between test runs for this WebTest. Default value is 300.
         * 
         * @return builder
         * 
         */
        public Builder frequency(@Nullable Output<Integer> frequency) {
            $.frequency = frequency;
            return this;
        }

        /**
         * @param frequency Interval in seconds between test runs for this WebTest. Default value is 300.
         * 
         * @return builder
         * 
         */
        public Builder frequency(Integer frequency) {
            return frequency(Output.of(frequency));
        }

        /**
         * @param kind The kind of web test that this web test watches. Choices are ping and multistep.
         * 
         * @return builder
         * 
         */
        public Builder kind(@Nullable Output<WebTestKind> kind) {
            $.kind = kind;
            return this;
        }

        /**
         * @param kind The kind of web test that this web test watches. Choices are ping and multistep.
         * 
         * @return builder
         * 
         */
        public Builder kind(WebTestKind kind) {
            return kind(Output.of(kind));
        }

        /**
         * @param location Resource location
         * 
         * @return builder
         * 
         */
        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        /**
         * @param location Resource location
         * 
         * @return builder
         * 
         */
        public Builder location(String location) {
            return location(Output.of(location));
        }

        /**
         * @param locations A list of where to physically run the tests from to give global coverage for accessibility of your application.
         * 
         * @return builder
         * 
         */
        public Builder locations(Output<List<WebTestGeolocationArgs>> locations) {
            $.locations = locations;
            return this;
        }

        /**
         * @param locations A list of where to physically run the tests from to give global coverage for accessibility of your application.
         * 
         * @return builder
         * 
         */
        public Builder locations(List<WebTestGeolocationArgs> locations) {
            return locations(Output.of(locations));
        }

        /**
         * @param locations A list of where to physically run the tests from to give global coverage for accessibility of your application.
         * 
         * @return builder
         * 
         */
        public Builder locations(WebTestGeolocationArgs... locations) {
            return locations(List.of(locations));
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
         * @param retryEnabled Allow for retries should this WebTest fail.
         * 
         * @return builder
         * 
         */
        public Builder retryEnabled(@Nullable Output<Boolean> retryEnabled) {
            $.retryEnabled = retryEnabled;
            return this;
        }

        /**
         * @param retryEnabled Allow for retries should this WebTest fail.
         * 
         * @return builder
         * 
         */
        public Builder retryEnabled(Boolean retryEnabled) {
            return retryEnabled(Output.of(retryEnabled));
        }

        /**
         * @param syntheticMonitorId Unique ID of this WebTest. This is typically the same value as the Name field.
         * 
         * @return builder
         * 
         */
        public Builder syntheticMonitorId(Output<String> syntheticMonitorId) {
            $.syntheticMonitorId = syntheticMonitorId;
            return this;
        }

        /**
         * @param syntheticMonitorId Unique ID of this WebTest. This is typically the same value as the Name field.
         * 
         * @return builder
         * 
         */
        public Builder syntheticMonitorId(String syntheticMonitorId) {
            return syntheticMonitorId(Output.of(syntheticMonitorId));
        }

        /**
         * @param tags Resource tags
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags Resource tags
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param timeout Seconds until this WebTest will timeout and fail. Default value is 30.
         * 
         * @return builder
         * 
         */
        public Builder timeout(@Nullable Output<Integer> timeout) {
            $.timeout = timeout;
            return this;
        }

        /**
         * @param timeout Seconds until this WebTest will timeout and fail. Default value is 30.
         * 
         * @return builder
         * 
         */
        public Builder timeout(Integer timeout) {
            return timeout(Output.of(timeout));
        }

        /**
         * @param webTestKind The kind of web test this is, valid choices are ping and multistep.
         * 
         * @return builder
         * 
         */
        public Builder webTestKind(Output<WebTestKind> webTestKind) {
            $.webTestKind = webTestKind;
            return this;
        }

        /**
         * @param webTestKind The kind of web test this is, valid choices are ping and multistep.
         * 
         * @return builder
         * 
         */
        public Builder webTestKind(WebTestKind webTestKind) {
            return webTestKind(Output.of(webTestKind));
        }

        /**
         * @param webTestName User defined name if this WebTest.
         * 
         * @return builder
         * 
         */
        public Builder webTestName(@Nullable Output<String> webTestName) {
            $.webTestName = webTestName;
            return this;
        }

        /**
         * @param webTestName User defined name if this WebTest.
         * 
         * @return builder
         * 
         */
        public Builder webTestName(String webTestName) {
            return webTestName(Output.of(webTestName));
        }

        public WebTestArgs build() {
            $.frequency = Codegen.integerProp("frequency").output().arg($.frequency).def(300).getNullable();
            $.kind = Codegen.objectProp("kind", WebTestKind.class).output().arg($.kind).def(WebTestKind.Ping).getNullable();
            $.locations = Objects.requireNonNull($.locations, "expected parameter 'locations' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.syntheticMonitorId = Objects.requireNonNull($.syntheticMonitorId, "expected parameter 'syntheticMonitorId' to be non-null");
            $.timeout = Codegen.integerProp("timeout").output().arg($.timeout).def(30).getNullable();
            $.webTestKind = Codegen.objectProp("webTestKind", WebTestKind.class).output().arg($.webTestKind).def(WebTestKind.Ping).require();
            return $;
        }
    }

}
