// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.insights;

import io.pulumi.azurenative.insights.enums.WebTestKind;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class WebTestArgs extends io.pulumi.resources.ResourceArgs {

    public static final WebTestArgs Empty = new WebTestArgs();

    /**
     * Purpose/user defined descriptive test for this WebTest.
     * 
     */
    @InputImport(name="description")
      private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * Is the test actively being monitored.
     * 
     */
    @InputImport(name="enabled")
      private final @Nullable Input<Boolean> enabled;

    public Input<Boolean> getEnabled() {
        return this.enabled == null ? Input.empty() : this.enabled;
    }

    /**
     * Interval in seconds between test runs for this WebTest. Default value is 300.
     * 
     */
    @InputImport(name="frequency")
      private final @Nullable Input<Integer> frequency;

    public Input<Integer> getFrequency() {
        return this.frequency == null ? Input.empty() : this.frequency;
    }

    /**
     * The kind of web test that this web test watches. Choices are ping and multistep.
     * 
     */
    @InputImport(name="kind")
      private final @Nullable Input<WebTestKind> kind;

    public Input<WebTestKind> getKind() {
        return this.kind == null ? Input.empty() : this.kind;
    }

    /**
     * Resource location
     * 
     */
    @InputImport(name="location")
      private final @Nullable Input<String> location;

    public Input<String> getLocation() {
        return this.location == null ? Input.empty() : this.location;
    }

    /**
     * The name of the resource group. The name is case insensitive.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
      private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Allow for retries should this WebTest fail.
     * 
     */
    @InputImport(name="retryEnabled")
      private final @Nullable Input<Boolean> retryEnabled;

    public Input<Boolean> getRetryEnabled() {
        return this.retryEnabled == null ? Input.empty() : this.retryEnabled;
    }

    /**
     * Unique ID of this WebTest. This is typically the same value as the Name field.
     * 
     */
    @InputImport(name="syntheticMonitorId", required=true)
      private final Input<String> syntheticMonitorId;

    public Input<String> getSyntheticMonitorId() {
        return this.syntheticMonitorId;
    }

    /**
     * Resource tags
     * 
     */
    @InputImport(name="tags")
      private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    /**
     * Seconds until this WebTest will timeout and fail. Default value is 30.
     * 
     */
    @InputImport(name="timeout")
      private final @Nullable Input<Integer> timeout;

    public Input<Integer> getTimeout() {
        return this.timeout == null ? Input.empty() : this.timeout;
    }

    /**
     * The kind of web test this is, valid choices are ping and multistep.
     * 
     */
    @InputImport(name="webTestKind", required=true)
      private final Input<WebTestKind> webTestKind;

    public Input<WebTestKind> getWebTestKind() {
        return this.webTestKind;
    }

    /**
     * User defined name if this WebTest.
     * 
     */
    @InputImport(name="webTestName")
      private final @Nullable Input<String> webTestName;

    public Input<String> getWebTestName() {
        return this.webTestName == null ? Input.empty() : this.webTestName;
    }

    public WebTestArgs(
        @Nullable Input<String> description,
        @Nullable Input<Boolean> enabled,
        @Nullable Input<Integer> frequency,
        @Nullable Input<WebTestKind> kind,
        @Nullable Input<String> location,
        Input<String> resourceGroupName,
        @Nullable Input<Boolean> retryEnabled,
        Input<String> syntheticMonitorId,
        @Nullable Input<Map<String,String>> tags,
        @Nullable Input<Integer> timeout,
        Input<WebTestKind> webTestKind,
        @Nullable Input<String> webTestName) {
        this.description = description;
        this.enabled = enabled;
        this.frequency = frequency == null ? Input.ofNullable(300) : frequency;
        this.kind = kind == null ? Input.ofNullable(io.pulumi.azurenative.insights.enums.WebTestKind.Ping) : kind;
        this.location = location;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.retryEnabled = retryEnabled;
        this.syntheticMonitorId = Objects.requireNonNull(syntheticMonitorId, "expected parameter 'syntheticMonitorId' to be non-null");
        this.tags = tags;
        this.timeout = timeout == null ? Input.ofNullable(30) : timeout;
        this.webTestKind = webTestKind == null ? Input.ofNullable(io.pulumi.azurenative.insights.enums.WebTestKind.Ping) : Objects.requireNonNull(webTestKind, "expected parameter 'webTestKind' to be non-null");
        this.webTestName = webTestName;
    }

    private WebTestArgs() {
        this.description = Input.empty();
        this.enabled = Input.empty();
        this.frequency = Input.empty();
        this.kind = Input.empty();
        this.location = Input.empty();
        this.resourceGroupName = Input.empty();
        this.retryEnabled = Input.empty();
        this.syntheticMonitorId = Input.empty();
        this.tags = Input.empty();
        this.timeout = Input.empty();
        this.webTestKind = Input.empty();
        this.webTestName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebTestArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> description;
        private @Nullable Input<Boolean> enabled;
        private @Nullable Input<Integer> frequency;
        private @Nullable Input<WebTestKind> kind;
        private @Nullable Input<String> location;
        private Input<String> resourceGroupName;
        private @Nullable Input<Boolean> retryEnabled;
        private Input<String> syntheticMonitorId;
        private @Nullable Input<Map<String,String>> tags;
        private @Nullable Input<Integer> timeout;
        private Input<WebTestKind> webTestKind;
        private @Nullable Input<String> webTestName;

        public Builder() {
    	      // Empty
        }

        public Builder(WebTestArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.enabled = defaults.enabled;
    	      this.frequency = defaults.frequency;
    	      this.kind = defaults.kind;
    	      this.location = defaults.location;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.retryEnabled = defaults.retryEnabled;
    	      this.syntheticMonitorId = defaults.syntheticMonitorId;
    	      this.tags = defaults.tags;
    	      this.timeout = defaults.timeout;
    	      this.webTestKind = defaults.webTestKind;
    	      this.webTestName = defaults.webTestName;
        }

        public Builder setDescription(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder setEnabled(@Nullable Input<Boolean> enabled) {
            this.enabled = enabled;
            return this;
        }

        public Builder setEnabled(@Nullable Boolean enabled) {
            this.enabled = Input.ofNullable(enabled);
            return this;
        }

        public Builder setFrequency(@Nullable Input<Integer> frequency) {
            this.frequency = frequency;
            return this;
        }

        public Builder setFrequency(@Nullable Integer frequency) {
            this.frequency = Input.ofNullable(frequency);
            return this;
        }

        public Builder setKind(@Nullable Input<WebTestKind> kind) {
            this.kind = kind;
            return this;
        }

        public Builder setKind(@Nullable WebTestKind kind) {
            this.kind = Input.ofNullable(kind);
            return this;
        }

        public Builder setLocation(@Nullable Input<String> location) {
            this.location = location;
            return this;
        }

        public Builder setLocation(@Nullable String location) {
            this.location = Input.ofNullable(location);
            return this;
        }

        public Builder setResourceGroupName(Input<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Input.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }

        public Builder setRetryEnabled(@Nullable Input<Boolean> retryEnabled) {
            this.retryEnabled = retryEnabled;
            return this;
        }

        public Builder setRetryEnabled(@Nullable Boolean retryEnabled) {
            this.retryEnabled = Input.ofNullable(retryEnabled);
            return this;
        }

        public Builder setSyntheticMonitorId(Input<String> syntheticMonitorId) {
            this.syntheticMonitorId = Objects.requireNonNull(syntheticMonitorId);
            return this;
        }

        public Builder setSyntheticMonitorId(String syntheticMonitorId) {
            this.syntheticMonitorId = Input.of(Objects.requireNonNull(syntheticMonitorId));
            return this;
        }

        public Builder setTags(@Nullable Input<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }

        public Builder setTimeout(@Nullable Input<Integer> timeout) {
            this.timeout = timeout;
            return this;
        }

        public Builder setTimeout(@Nullable Integer timeout) {
            this.timeout = Input.ofNullable(timeout);
            return this;
        }

        public Builder setWebTestKind(Input<WebTestKind> webTestKind) {
            this.webTestKind = Objects.requireNonNull(webTestKind);
            return this;
        }

        public Builder setWebTestKind(WebTestKind webTestKind) {
            this.webTestKind = Input.of(Objects.requireNonNull(webTestKind));
            return this;
        }

        public Builder setWebTestName(@Nullable Input<String> webTestName) {
            this.webTestName = webTestName;
            return this;
        }

        public Builder setWebTestName(@Nullable String webTestName) {
            this.webTestName = Input.ofNullable(webTestName);
            return this;
        }
        public WebTestArgs build() {
            return new WebTestArgs(description, enabled, frequency, kind, location, resourceGroupName, retryEnabled, syntheticMonitorId, tags, timeout, webTestKind, webTestName);
        }
    }
}