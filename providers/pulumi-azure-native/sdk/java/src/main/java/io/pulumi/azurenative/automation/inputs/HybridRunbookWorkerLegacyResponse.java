// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.automation.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Definition of hybrid runbook worker Legacy.
 * 
 */
public final class HybridRunbookWorkerLegacyResponse extends io.pulumi.resources.InvokeArgs {

    public static final HybridRunbookWorkerLegacyResponse Empty = new HybridRunbookWorkerLegacyResponse();

    /**
     * Gets or sets the assigned machine IP address.
     * 
     */
    @InputImport(name="ip")
    private final @Nullable String ip;

    public Optional<String> getIp() {
        return this.ip == null ? Optional.empty() : Optional.ofNullable(this.ip);
    }

    /**
     * Last Heartbeat from the Worker
     * 
     */
    @InputImport(name="lastSeenDateTime")
    private final @Nullable String lastSeenDateTime;

    public Optional<String> getLastSeenDateTime() {
        return this.lastSeenDateTime == null ? Optional.empty() : Optional.ofNullable(this.lastSeenDateTime);
    }

    /**
     * Gets or sets the worker machine name.
     * 
     */
    @InputImport(name="name")
    private final @Nullable String name;

    public Optional<String> getName() {
        return this.name == null ? Optional.empty() : Optional.ofNullable(this.name);
    }

    /**
     * Gets or sets the registration time of the worker machine.
     * 
     */
    @InputImport(name="registrationTime")
    private final @Nullable String registrationTime;

    public Optional<String> getRegistrationTime() {
        return this.registrationTime == null ? Optional.empty() : Optional.ofNullable(this.registrationTime);
    }

    public HybridRunbookWorkerLegacyResponse(
        @Nullable String ip,
        @Nullable String lastSeenDateTime,
        @Nullable String name,
        @Nullable String registrationTime) {
        this.ip = ip;
        this.lastSeenDateTime = lastSeenDateTime;
        this.name = name;
        this.registrationTime = registrationTime;
    }

    private HybridRunbookWorkerLegacyResponse() {
        this.ip = null;
        this.lastSeenDateTime = null;
        this.name = null;
        this.registrationTime = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HybridRunbookWorkerLegacyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String ip;
        private @Nullable String lastSeenDateTime;
        private @Nullable String name;
        private @Nullable String registrationTime;

        public Builder() {
    	      // Empty
        }

        public Builder(HybridRunbookWorkerLegacyResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ip = defaults.ip;
    	      this.lastSeenDateTime = defaults.lastSeenDateTime;
    	      this.name = defaults.name;
    	      this.registrationTime = defaults.registrationTime;
        }

        public Builder setIp(@Nullable String ip) {
            this.ip = ip;
            return this;
        }

        public Builder setLastSeenDateTime(@Nullable String lastSeenDateTime) {
            this.lastSeenDateTime = lastSeenDateTime;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = name;
            return this;
        }

        public Builder setRegistrationTime(@Nullable String registrationTime) {
            this.registrationTime = registrationTime;
            return this;
        }

        public HybridRunbookWorkerLegacyResponse build() {
            return new HybridRunbookWorkerLegacyResponse(ip, lastSeenDateTime, name, registrationTime);
        }
    }
}
