// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.rum.inputs;

import io.pulumi.awsnative.rum.enums.AppMonitorTelemetry;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AppMonitorConfiguration extends io.pulumi.resources.InvokeArgs {

    public static final AppMonitorConfiguration Empty = new AppMonitorConfiguration();

    @InputImport(name="allowCookies")
    private final @Nullable Boolean allowCookies;

    public Optional<Boolean> getAllowCookies() {
        return this.allowCookies == null ? Optional.empty() : Optional.ofNullable(this.allowCookies);
    }

    @InputImport(name="enableXRay")
    private final @Nullable Boolean enableXRay;

    public Optional<Boolean> getEnableXRay() {
        return this.enableXRay == null ? Optional.empty() : Optional.ofNullable(this.enableXRay);
    }

    @InputImport(name="excludedPages")
    private final @Nullable List<String> excludedPages;

    public List<String> getExcludedPages() {
        return this.excludedPages == null ? List.of() : this.excludedPages;
    }

    @InputImport(name="favoritePages")
    private final @Nullable List<String> favoritePages;

    public List<String> getFavoritePages() {
        return this.favoritePages == null ? List.of() : this.favoritePages;
    }

    @InputImport(name="guestRoleArn")
    private final @Nullable String guestRoleArn;

    public Optional<String> getGuestRoleArn() {
        return this.guestRoleArn == null ? Optional.empty() : Optional.ofNullable(this.guestRoleArn);
    }

    @InputImport(name="identityPoolId")
    private final @Nullable String identityPoolId;

    public Optional<String> getIdentityPoolId() {
        return this.identityPoolId == null ? Optional.empty() : Optional.ofNullable(this.identityPoolId);
    }

    @InputImport(name="includedPages")
    private final @Nullable List<String> includedPages;

    public List<String> getIncludedPages() {
        return this.includedPages == null ? List.of() : this.includedPages;
    }

    @InputImport(name="sessionSampleRate")
    private final @Nullable Double sessionSampleRate;

    public Optional<Double> getSessionSampleRate() {
        return this.sessionSampleRate == null ? Optional.empty() : Optional.ofNullable(this.sessionSampleRate);
    }

    @InputImport(name="telemetries")
    private final @Nullable List<AppMonitorTelemetry> telemetries;

    public List<AppMonitorTelemetry> getTelemetries() {
        return this.telemetries == null ? List.of() : this.telemetries;
    }

    public AppMonitorConfiguration(
        @Nullable Boolean allowCookies,
        @Nullable Boolean enableXRay,
        @Nullable List<String> excludedPages,
        @Nullable List<String> favoritePages,
        @Nullable String guestRoleArn,
        @Nullable String identityPoolId,
        @Nullable List<String> includedPages,
        @Nullable Double sessionSampleRate,
        @Nullable List<AppMonitorTelemetry> telemetries) {
        this.allowCookies = allowCookies;
        this.enableXRay = enableXRay;
        this.excludedPages = excludedPages;
        this.favoritePages = favoritePages;
        this.guestRoleArn = guestRoleArn;
        this.identityPoolId = identityPoolId;
        this.includedPages = includedPages;
        this.sessionSampleRate = sessionSampleRate;
        this.telemetries = telemetries;
    }

    private AppMonitorConfiguration() {
        this.allowCookies = null;
        this.enableXRay = null;
        this.excludedPages = List.of();
        this.favoritePages = List.of();
        this.guestRoleArn = null;
        this.identityPoolId = null;
        this.includedPages = List.of();
        this.sessionSampleRate = null;
        this.telemetries = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AppMonitorConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean allowCookies;
        private @Nullable Boolean enableXRay;
        private @Nullable List<String> excludedPages;
        private @Nullable List<String> favoritePages;
        private @Nullable String guestRoleArn;
        private @Nullable String identityPoolId;
        private @Nullable List<String> includedPages;
        private @Nullable Double sessionSampleRate;
        private @Nullable List<AppMonitorTelemetry> telemetries;

        public Builder() {
    	      // Empty
        }

        public Builder(AppMonitorConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowCookies = defaults.allowCookies;
    	      this.enableXRay = defaults.enableXRay;
    	      this.excludedPages = defaults.excludedPages;
    	      this.favoritePages = defaults.favoritePages;
    	      this.guestRoleArn = defaults.guestRoleArn;
    	      this.identityPoolId = defaults.identityPoolId;
    	      this.includedPages = defaults.includedPages;
    	      this.sessionSampleRate = defaults.sessionSampleRate;
    	      this.telemetries = defaults.telemetries;
        }

        public Builder setAllowCookies(@Nullable Boolean allowCookies) {
            this.allowCookies = allowCookies;
            return this;
        }

        public Builder setEnableXRay(@Nullable Boolean enableXRay) {
            this.enableXRay = enableXRay;
            return this;
        }

        public Builder setExcludedPages(@Nullable List<String> excludedPages) {
            this.excludedPages = excludedPages;
            return this;
        }

        public Builder setFavoritePages(@Nullable List<String> favoritePages) {
            this.favoritePages = favoritePages;
            return this;
        }

        public Builder setGuestRoleArn(@Nullable String guestRoleArn) {
            this.guestRoleArn = guestRoleArn;
            return this;
        }

        public Builder setIdentityPoolId(@Nullable String identityPoolId) {
            this.identityPoolId = identityPoolId;
            return this;
        }

        public Builder setIncludedPages(@Nullable List<String> includedPages) {
            this.includedPages = includedPages;
            return this;
        }

        public Builder setSessionSampleRate(@Nullable Double sessionSampleRate) {
            this.sessionSampleRate = sessionSampleRate;
            return this;
        }

        public Builder setTelemetries(@Nullable List<AppMonitorTelemetry> telemetries) {
            this.telemetries = telemetries;
            return this;
        }

        public AppMonitorConfiguration build() {
            return new AppMonitorConfiguration(allowCookies, enableXRay, excludedPages, favoritePages, guestRoleArn, identityPoolId, includedPages, sessionSampleRate, telemetries);
        }
    }
}
