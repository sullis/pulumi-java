// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.opensearchservice.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class DomainServiceSoftwareOptions {
    private final @Nullable String automatedUpdateDate;
    private final @Nullable Boolean cancellable;
    private final @Nullable String currentVersion;
    private final @Nullable String description;
    private final @Nullable String newVersion;
    private final @Nullable Boolean optionalDeployment;
    private final @Nullable Boolean updateAvailable;
    private final @Nullable String updateStatus;

    @OutputCustomType.Constructor({"automatedUpdateDate","cancellable","currentVersion","description","newVersion","optionalDeployment","updateAvailable","updateStatus"})
    private DomainServiceSoftwareOptions(
        @Nullable String automatedUpdateDate,
        @Nullable Boolean cancellable,
        @Nullable String currentVersion,
        @Nullable String description,
        @Nullable String newVersion,
        @Nullable Boolean optionalDeployment,
        @Nullable Boolean updateAvailable,
        @Nullable String updateStatus) {
        this.automatedUpdateDate = automatedUpdateDate;
        this.cancellable = cancellable;
        this.currentVersion = currentVersion;
        this.description = description;
        this.newVersion = newVersion;
        this.optionalDeployment = optionalDeployment;
        this.updateAvailable = updateAvailable;
        this.updateStatus = updateStatus;
    }

    public Optional<String> getAutomatedUpdateDate() {
        return Optional.ofNullable(this.automatedUpdateDate);
    }
    public Optional<Boolean> getCancellable() {
        return Optional.ofNullable(this.cancellable);
    }
    public Optional<String> getCurrentVersion() {
        return Optional.ofNullable(this.currentVersion);
    }
    public Optional<String> getDescription() {
        return Optional.ofNullable(this.description);
    }
    public Optional<String> getNewVersion() {
        return Optional.ofNullable(this.newVersion);
    }
    public Optional<Boolean> getOptionalDeployment() {
        return Optional.ofNullable(this.optionalDeployment);
    }
    public Optional<Boolean> getUpdateAvailable() {
        return Optional.ofNullable(this.updateAvailable);
    }
    public Optional<String> getUpdateStatus() {
        return Optional.ofNullable(this.updateStatus);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DomainServiceSoftwareOptions defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String automatedUpdateDate;
        private @Nullable Boolean cancellable;
        private @Nullable String currentVersion;
        private @Nullable String description;
        private @Nullable String newVersion;
        private @Nullable Boolean optionalDeployment;
        private @Nullable Boolean updateAvailable;
        private @Nullable String updateStatus;

        public Builder() {
    	      // Empty
        }

        public Builder(DomainServiceSoftwareOptions defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.automatedUpdateDate = defaults.automatedUpdateDate;
    	      this.cancellable = defaults.cancellable;
    	      this.currentVersion = defaults.currentVersion;
    	      this.description = defaults.description;
    	      this.newVersion = defaults.newVersion;
    	      this.optionalDeployment = defaults.optionalDeployment;
    	      this.updateAvailable = defaults.updateAvailable;
    	      this.updateStatus = defaults.updateStatus;
        }

        public Builder setAutomatedUpdateDate(@Nullable String automatedUpdateDate) {
            this.automatedUpdateDate = automatedUpdateDate;
            return this;
        }

        public Builder setCancellable(@Nullable Boolean cancellable) {
            this.cancellable = cancellable;
            return this;
        }

        public Builder setCurrentVersion(@Nullable String currentVersion) {
            this.currentVersion = currentVersion;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = description;
            return this;
        }

        public Builder setNewVersion(@Nullable String newVersion) {
            this.newVersion = newVersion;
            return this;
        }

        public Builder setOptionalDeployment(@Nullable Boolean optionalDeployment) {
            this.optionalDeployment = optionalDeployment;
            return this;
        }

        public Builder setUpdateAvailable(@Nullable Boolean updateAvailable) {
            this.updateAvailable = updateAvailable;
            return this;
        }

        public Builder setUpdateStatus(@Nullable String updateStatus) {
            this.updateStatus = updateStatus;
            return this;
        }

        public DomainServiceSoftwareOptions build() {
            return new DomainServiceSoftwareOptions(automatedUpdateDate, cancellable, currentVersion, description, newVersion, optionalDeployment, updateAvailable, updateStatus);
        }
    }
}
