// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * An SOA record.
 * 
 */
public final class SoaRecordArgs extends io.pulumi.resources.ResourceArgs {

    public static final SoaRecordArgs Empty = new SoaRecordArgs();

    /**
     * The email contact for this SOA record.
     * 
     */
    @InputImport(name="email")
    private final @Nullable Input<String> email;

    public Input<String> getEmail() {
        return this.email == null ? Input.empty() : this.email;
    }

    /**
     * The expire time for this SOA record.
     * 
     */
    @InputImport(name="expireTime")
    private final @Nullable Input<Double> expireTime;

    public Input<Double> getExpireTime() {
        return this.expireTime == null ? Input.empty() : this.expireTime;
    }

    /**
     * The domain name of the authoritative name server for this SOA record.
     * 
     */
    @InputImport(name="host")
    private final @Nullable Input<String> host;

    public Input<String> getHost() {
        return this.host == null ? Input.empty() : this.host;
    }

    /**
     * The minimum value for this SOA record. By convention this is used to determine the negative caching duration.
     * 
     */
    @InputImport(name="minimumTtl")
    private final @Nullable Input<Double> minimumTtl;

    public Input<Double> getMinimumTtl() {
        return this.minimumTtl == null ? Input.empty() : this.minimumTtl;
    }

    /**
     * The refresh value for this SOA record.
     * 
     */
    @InputImport(name="refreshTime")
    private final @Nullable Input<Double> refreshTime;

    public Input<Double> getRefreshTime() {
        return this.refreshTime == null ? Input.empty() : this.refreshTime;
    }

    /**
     * The retry time for this SOA record.
     * 
     */
    @InputImport(name="retryTime")
    private final @Nullable Input<Double> retryTime;

    public Input<Double> getRetryTime() {
        return this.retryTime == null ? Input.empty() : this.retryTime;
    }

    /**
     * The serial number for this SOA record.
     * 
     */
    @InputImport(name="serialNumber")
    private final @Nullable Input<Double> serialNumber;

    public Input<Double> getSerialNumber() {
        return this.serialNumber == null ? Input.empty() : this.serialNumber;
    }

    public SoaRecordArgs(
        @Nullable Input<String> email,
        @Nullable Input<Double> expireTime,
        @Nullable Input<String> host,
        @Nullable Input<Double> minimumTtl,
        @Nullable Input<Double> refreshTime,
        @Nullable Input<Double> retryTime,
        @Nullable Input<Double> serialNumber) {
        this.email = email;
        this.expireTime = expireTime;
        this.host = host;
        this.minimumTtl = minimumTtl;
        this.refreshTime = refreshTime;
        this.retryTime = retryTime;
        this.serialNumber = serialNumber;
    }

    private SoaRecordArgs() {
        this.email = Input.empty();
        this.expireTime = Input.empty();
        this.host = Input.empty();
        this.minimumTtl = Input.empty();
        this.refreshTime = Input.empty();
        this.retryTime = Input.empty();
        this.serialNumber = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SoaRecordArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> email;
        private @Nullable Input<Double> expireTime;
        private @Nullable Input<String> host;
        private @Nullable Input<Double> minimumTtl;
        private @Nullable Input<Double> refreshTime;
        private @Nullable Input<Double> retryTime;
        private @Nullable Input<Double> serialNumber;

        public Builder() {
    	      // Empty
        }

        public Builder(SoaRecordArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.email = defaults.email;
    	      this.expireTime = defaults.expireTime;
    	      this.host = defaults.host;
    	      this.minimumTtl = defaults.minimumTtl;
    	      this.refreshTime = defaults.refreshTime;
    	      this.retryTime = defaults.retryTime;
    	      this.serialNumber = defaults.serialNumber;
        }

        public Builder setEmail(@Nullable Input<String> email) {
            this.email = email;
            return this;
        }

        public Builder setEmail(@Nullable String email) {
            this.email = Input.ofNullable(email);
            return this;
        }

        public Builder setExpireTime(@Nullable Input<Double> expireTime) {
            this.expireTime = expireTime;
            return this;
        }

        public Builder setExpireTime(@Nullable Double expireTime) {
            this.expireTime = Input.ofNullable(expireTime);
            return this;
        }

        public Builder setHost(@Nullable Input<String> host) {
            this.host = host;
            return this;
        }

        public Builder setHost(@Nullable String host) {
            this.host = Input.ofNullable(host);
            return this;
        }

        public Builder setMinimumTtl(@Nullable Input<Double> minimumTtl) {
            this.minimumTtl = minimumTtl;
            return this;
        }

        public Builder setMinimumTtl(@Nullable Double minimumTtl) {
            this.minimumTtl = Input.ofNullable(minimumTtl);
            return this;
        }

        public Builder setRefreshTime(@Nullable Input<Double> refreshTime) {
            this.refreshTime = refreshTime;
            return this;
        }

        public Builder setRefreshTime(@Nullable Double refreshTime) {
            this.refreshTime = Input.ofNullable(refreshTime);
            return this;
        }

        public Builder setRetryTime(@Nullable Input<Double> retryTime) {
            this.retryTime = retryTime;
            return this;
        }

        public Builder setRetryTime(@Nullable Double retryTime) {
            this.retryTime = Input.ofNullable(retryTime);
            return this;
        }

        public Builder setSerialNumber(@Nullable Input<Double> serialNumber) {
            this.serialNumber = serialNumber;
            return this;
        }

        public Builder setSerialNumber(@Nullable Double serialNumber) {
            this.serialNumber = Input.ofNullable(serialNumber);
            return this;
        }

        public SoaRecordArgs build() {
            return new SoaRecordArgs(email, expireTime, host, minimumTtl, refreshTime, retryTime, serialNumber);
        }
    }
}
