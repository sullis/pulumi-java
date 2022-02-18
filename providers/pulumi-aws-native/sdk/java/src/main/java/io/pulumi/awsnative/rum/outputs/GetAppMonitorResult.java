// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.rum.outputs;

import io.pulumi.awsnative.rum.outputs.AppMonitorConfiguration;
import io.pulumi.awsnative.rum.outputs.AppMonitorTag;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetAppMonitorResult {
    private final @Nullable AppMonitorConfiguration appMonitorConfiguration;
    /**
     * Data collected by RUM is kept by RUM for 30 days and then deleted. This parameter specifies whether RUM sends a copy of this telemetry data to CWLlong in your account. This enables you to keep the telemetry data for more than 30 days, but it does incur CWLlong charges. If you omit this parameter, the default is false
     * 
     */
    private final @Nullable Boolean cwLogEnabled;
    /**
     * The top-level internet domain name for which your application has administrative authority.
     * 
     */
    private final @Nullable String domain;
    private final @Nullable List<AppMonitorTag> tags;

    @OutputCustomType.Constructor({"appMonitorConfiguration","cwLogEnabled","domain","tags"})
    private GetAppMonitorResult(
        @Nullable AppMonitorConfiguration appMonitorConfiguration,
        @Nullable Boolean cwLogEnabled,
        @Nullable String domain,
        @Nullable List<AppMonitorTag> tags) {
        this.appMonitorConfiguration = appMonitorConfiguration;
        this.cwLogEnabled = cwLogEnabled;
        this.domain = domain;
        this.tags = tags;
    }

    public Optional<AppMonitorConfiguration> getAppMonitorConfiguration() {
        return Optional.ofNullable(this.appMonitorConfiguration);
    }
    /**
     * Data collected by RUM is kept by RUM for 30 days and then deleted. This parameter specifies whether RUM sends a copy of this telemetry data to CWLlong in your account. This enables you to keep the telemetry data for more than 30 days, but it does incur CWLlong charges. If you omit this parameter, the default is false
     * 
     */
    public Optional<Boolean> getCwLogEnabled() {
        return Optional.ofNullable(this.cwLogEnabled);
    }
    /**
     * The top-level internet domain name for which your application has administrative authority.
     * 
     */
    public Optional<String> getDomain() {
        return Optional.ofNullable(this.domain);
    }
    public List<AppMonitorTag> getTags() {
        return this.tags == null ? List.of() : this.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAppMonitorResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable AppMonitorConfiguration appMonitorConfiguration;
        private @Nullable Boolean cwLogEnabled;
        private @Nullable String domain;
        private @Nullable List<AppMonitorTag> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(GetAppMonitorResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.appMonitorConfiguration = defaults.appMonitorConfiguration;
    	      this.cwLogEnabled = defaults.cwLogEnabled;
    	      this.domain = defaults.domain;
    	      this.tags = defaults.tags;
        }

        public Builder setAppMonitorConfiguration(@Nullable AppMonitorConfiguration appMonitorConfiguration) {
            this.appMonitorConfiguration = appMonitorConfiguration;
            return this;
        }

        public Builder setCwLogEnabled(@Nullable Boolean cwLogEnabled) {
            this.cwLogEnabled = cwLogEnabled;
            return this;
        }

        public Builder setDomain(@Nullable String domain) {
            this.domain = domain;
            return this;
        }

        public Builder setTags(@Nullable List<AppMonitorTag> tags) {
            this.tags = tags;
            return this;
        }

        public GetAppMonitorResult build() {
            return new GetAppMonitorResult(appMonitorConfiguration, cwLogEnabled, domain, tags);
        }
    }
}
