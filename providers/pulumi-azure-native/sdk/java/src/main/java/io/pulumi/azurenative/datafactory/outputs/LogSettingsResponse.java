// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.outputs;

import io.pulumi.azurenative.datafactory.outputs.CopyActivityLogSettingsResponse;
import io.pulumi.azurenative.datafactory.outputs.LogLocationSettingsResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Object;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class LogSettingsResponse {
    /**
     * Specifies settings for copy activity log.
     * 
     */
    private final @Nullable CopyActivityLogSettingsResponse copyActivityLogSettings;
    /**
     * Specifies whether to enable copy activity log. Type: boolean (or Expression with resultType boolean).
     * 
     */
    private final @Nullable Object enableCopyActivityLog;
    /**
     * Log location settings customer needs to provide when enabling log.
     * 
     */
    private final LogLocationSettingsResponse logLocationSettings;

    @OutputCustomType.Constructor({"copyActivityLogSettings","enableCopyActivityLog","logLocationSettings"})
    private LogSettingsResponse(
        @Nullable CopyActivityLogSettingsResponse copyActivityLogSettings,
        @Nullable Object enableCopyActivityLog,
        LogLocationSettingsResponse logLocationSettings) {
        this.copyActivityLogSettings = copyActivityLogSettings;
        this.enableCopyActivityLog = enableCopyActivityLog;
        this.logLocationSettings = Objects.requireNonNull(logLocationSettings);
    }

    /**
     * Specifies settings for copy activity log.
     * 
    */
    public Optional<CopyActivityLogSettingsResponse> getCopyActivityLogSettings() {
        return Optional.ofNullable(this.copyActivityLogSettings);
    }
    /**
     * Specifies whether to enable copy activity log. Type: boolean (or Expression with resultType boolean).
     * 
    */
    public Optional<Object> getEnableCopyActivityLog() {
        return Optional.ofNullable(this.enableCopyActivityLog);
    }
    /**
     * Log location settings customer needs to provide when enabling log.
     * 
    */
    public LogLocationSettingsResponse getLogLocationSettings() {
        return this.logLocationSettings;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LogSettingsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable CopyActivityLogSettingsResponse copyActivityLogSettings;
        private @Nullable Object enableCopyActivityLog;
        private LogLocationSettingsResponse logLocationSettings;

        public Builder() {
    	      // Empty
        }

        public Builder(LogSettingsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.copyActivityLogSettings = defaults.copyActivityLogSettings;
    	      this.enableCopyActivityLog = defaults.enableCopyActivityLog;
    	      this.logLocationSettings = defaults.logLocationSettings;
        }

        public Builder setCopyActivityLogSettings(@Nullable CopyActivityLogSettingsResponse copyActivityLogSettings) {
            this.copyActivityLogSettings = copyActivityLogSettings;
            return this;
        }

        public Builder setEnableCopyActivityLog(@Nullable Object enableCopyActivityLog) {
            this.enableCopyActivityLog = enableCopyActivityLog;
            return this;
        }

        public Builder setLogLocationSettings(LogLocationSettingsResponse logLocationSettings) {
            this.logLocationSettings = Objects.requireNonNull(logLocationSettings);
            return this;
        }
        public LogSettingsResponse build() {
            return new LogSettingsResponse(copyActivityLogSettings, enableCopyActivityLog, logLocationSettings);
        }
    }
}