// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.insights.outputs;

import com.pulumi.azurenative.insights.outputs.WebTestGeolocationResponse;
import com.pulumi.azurenative.insights.outputs.WebTestPropertiesResponseConfiguration;
import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetWebTestResult {
    /**
     * @return An XML configuration specification for a WebTest.
     * 
     */
    private final @Nullable WebTestPropertiesResponseConfiguration configuration;
    /**
     * @return Purpose/user defined descriptive test for this WebTest.
     * 
     */
    private final @Nullable String description;
    /**
     * @return Is the test actively being monitored.
     * 
     */
    private final @Nullable Boolean enabled;
    /**
     * @return Interval in seconds between test runs for this WebTest. Default value is 300.
     * 
     */
    private final @Nullable Integer frequency;
    /**
     * @return Azure resource Id
     * 
     */
    private final String id;
    /**
     * @return The kind of web test that this web test watches. Choices are ping and multistep.
     * 
     */
    private final @Nullable String kind;
    /**
     * @return Resource location
     * 
     */
    private final String location;
    /**
     * @return A list of where to physically run the tests from to give global coverage for accessibility of your application.
     * 
     */
    private final List<WebTestGeolocationResponse> locations;
    /**
     * @return Azure resource name
     * 
     */
    private final String name;
    /**
     * @return Current state of this component, whether or not is has been provisioned within the resource group it is defined. Users cannot change this value but are able to read from it. Values will include Succeeded, Deploying, Canceled, and Failed.
     * 
     */
    private final String provisioningState;
    /**
     * @return Allow for retries should this WebTest fail.
     * 
     */
    private final @Nullable Boolean retryEnabled;
    /**
     * @return Unique ID of this WebTest. This is typically the same value as the Name field.
     * 
     */
    private final String syntheticMonitorId;
    /**
     * @return Resource tags
     * 
     */
    private final @Nullable Map<String,String> tags;
    /**
     * @return Seconds until this WebTest will timeout and fail. Default value is 30.
     * 
     */
    private final @Nullable Integer timeout;
    /**
     * @return Azure resource type
     * 
     */
    private final String type;
    /**
     * @return The kind of web test this is, valid choices are ping and multistep.
     * 
     */
    private final String webTestKind;
    /**
     * @return User defined name if this WebTest.
     * 
     */
    private final String webTestName;

    @CustomType.Constructor
    private GetWebTestResult(
        @CustomType.Parameter("configuration") @Nullable WebTestPropertiesResponseConfiguration configuration,
        @CustomType.Parameter("description") @Nullable String description,
        @CustomType.Parameter("enabled") @Nullable Boolean enabled,
        @CustomType.Parameter("frequency") @Nullable Integer frequency,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("kind") @Nullable String kind,
        @CustomType.Parameter("location") String location,
        @CustomType.Parameter("locations") List<WebTestGeolocationResponse> locations,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("provisioningState") String provisioningState,
        @CustomType.Parameter("retryEnabled") @Nullable Boolean retryEnabled,
        @CustomType.Parameter("syntheticMonitorId") String syntheticMonitorId,
        @CustomType.Parameter("tags") @Nullable Map<String,String> tags,
        @CustomType.Parameter("timeout") @Nullable Integer timeout,
        @CustomType.Parameter("type") String type,
        @CustomType.Parameter("webTestKind") String webTestKind,
        @CustomType.Parameter("webTestName") String webTestName) {
        this.configuration = configuration;
        this.description = description;
        this.enabled = enabled;
        this.frequency = frequency;
        this.id = id;
        this.kind = kind;
        this.location = location;
        this.locations = locations;
        this.name = name;
        this.provisioningState = provisioningState;
        this.retryEnabled = retryEnabled;
        this.syntheticMonitorId = syntheticMonitorId;
        this.tags = tags;
        this.timeout = timeout;
        this.type = type;
        this.webTestKind = webTestKind;
        this.webTestName = webTestName;
    }

    /**
     * @return An XML configuration specification for a WebTest.
     * 
     */
    public Optional<WebTestPropertiesResponseConfiguration> configuration() {
        return Optional.ofNullable(this.configuration);
    }
    /**
     * @return Purpose/user defined descriptive test for this WebTest.
     * 
     */
    public Optional<String> description() {
        return Optional.ofNullable(this.description);
    }
    /**
     * @return Is the test actively being monitored.
     * 
     */
    public Optional<Boolean> enabled() {
        return Optional.ofNullable(this.enabled);
    }
    /**
     * @return Interval in seconds between test runs for this WebTest. Default value is 300.
     * 
     */
    public Optional<Integer> frequency() {
        return Optional.ofNullable(this.frequency);
    }
    /**
     * @return Azure resource Id
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The kind of web test that this web test watches. Choices are ping and multistep.
     * 
     */
    public Optional<String> kind() {
        return Optional.ofNullable(this.kind);
    }
    /**
     * @return Resource location
     * 
     */
    public String location() {
        return this.location;
    }
    /**
     * @return A list of where to physically run the tests from to give global coverage for accessibility of your application.
     * 
     */
    public List<WebTestGeolocationResponse> locations() {
        return this.locations;
    }
    /**
     * @return Azure resource name
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Current state of this component, whether or not is has been provisioned within the resource group it is defined. Users cannot change this value but are able to read from it. Values will include Succeeded, Deploying, Canceled, and Failed.
     * 
     */
    public String provisioningState() {
        return this.provisioningState;
    }
    /**
     * @return Allow for retries should this WebTest fail.
     * 
     */
    public Optional<Boolean> retryEnabled() {
        return Optional.ofNullable(this.retryEnabled);
    }
    /**
     * @return Unique ID of this WebTest. This is typically the same value as the Name field.
     * 
     */
    public String syntheticMonitorId() {
        return this.syntheticMonitorId;
    }
    /**
     * @return Resource tags
     * 
     */
    public Map<String,String> tags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    /**
     * @return Seconds until this WebTest will timeout and fail. Default value is 30.
     * 
     */
    public Optional<Integer> timeout() {
        return Optional.ofNullable(this.timeout);
    }
    /**
     * @return Azure resource type
     * 
     */
    public String type() {
        return this.type;
    }
    /**
     * @return The kind of web test this is, valid choices are ping and multistep.
     * 
     */
    public String webTestKind() {
        return this.webTestKind;
    }
    /**
     * @return User defined name if this WebTest.
     * 
     */
    public String webTestName() {
        return this.webTestName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetWebTestResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable WebTestPropertiesResponseConfiguration configuration;
        private @Nullable String description;
        private @Nullable Boolean enabled;
        private @Nullable Integer frequency;
        private String id;
        private @Nullable String kind;
        private String location;
        private List<WebTestGeolocationResponse> locations;
        private String name;
        private String provisioningState;
        private @Nullable Boolean retryEnabled;
        private String syntheticMonitorId;
        private @Nullable Map<String,String> tags;
        private @Nullable Integer timeout;
        private String type;
        private String webTestKind;
        private String webTestName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetWebTestResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.configuration = defaults.configuration;
    	      this.description = defaults.description;
    	      this.enabled = defaults.enabled;
    	      this.frequency = defaults.frequency;
    	      this.id = defaults.id;
    	      this.kind = defaults.kind;
    	      this.location = defaults.location;
    	      this.locations = defaults.locations;
    	      this.name = defaults.name;
    	      this.provisioningState = defaults.provisioningState;
    	      this.retryEnabled = defaults.retryEnabled;
    	      this.syntheticMonitorId = defaults.syntheticMonitorId;
    	      this.tags = defaults.tags;
    	      this.timeout = defaults.timeout;
    	      this.type = defaults.type;
    	      this.webTestKind = defaults.webTestKind;
    	      this.webTestName = defaults.webTestName;
        }

        public Builder configuration(@Nullable WebTestPropertiesResponseConfiguration configuration) {
            this.configuration = configuration;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = description;
            return this;
        }
        public Builder enabled(@Nullable Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Builder frequency(@Nullable Integer frequency) {
            this.frequency = frequency;
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder kind(@Nullable String kind) {
            this.kind = kind;
            return this;
        }
        public Builder location(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }
        public Builder locations(List<WebTestGeolocationResponse> locations) {
            this.locations = Objects.requireNonNull(locations);
            return this;
        }
        public Builder locations(WebTestGeolocationResponse... locations) {
            return locations(List.of(locations));
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder provisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }
        public Builder retryEnabled(@Nullable Boolean retryEnabled) {
            this.retryEnabled = retryEnabled;
            return this;
        }
        public Builder syntheticMonitorId(String syntheticMonitorId) {
            this.syntheticMonitorId = Objects.requireNonNull(syntheticMonitorId);
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }
        public Builder timeout(@Nullable Integer timeout) {
            this.timeout = timeout;
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder webTestKind(String webTestKind) {
            this.webTestKind = Objects.requireNonNull(webTestKind);
            return this;
        }
        public Builder webTestName(String webTestName) {
            this.webTestName = Objects.requireNonNull(webTestName);
            return this;
        }        public GetWebTestResult build() {
            return new GetWebTestResult(configuration, description, enabled, frequency, id, kind, location, locations, name, provisioningState, retryEnabled, syntheticMonitorId, tags, timeout, type, webTestKind, webTestName);
        }
    }
}
