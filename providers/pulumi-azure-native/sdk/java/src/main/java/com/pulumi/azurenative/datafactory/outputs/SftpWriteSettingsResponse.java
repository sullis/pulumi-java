// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datafactory.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class SftpWriteSettingsResponse {
    /**
     * @return The type of copy behavior for copy sink.
     * 
     */
    private final @Nullable Object copyBehavior;
    /**
     * @return If true, disable data store metrics collection. Default is false. Type: boolean (or Expression with resultType boolean).
     * 
     */
    private final @Nullable Object disableMetricsCollection;
    /**
     * @return The maximum concurrent connection count for the source data store. Type: integer (or Expression with resultType integer).
     * 
     */
    private final @Nullable Object maxConcurrentConnections;
    /**
     * @return Specifies the timeout for writing each chunk to SFTP server. Default value: 01:00:00 (one hour). Type: string (or Expression with resultType string).
     * 
     */
    private final @Nullable Object operationTimeout;
    /**
     * @return The write setting type.
     * Expected value is &#39;SftpWriteSettings&#39;.
     * 
     */
    private final String type;
    /**
     * @return Upload to temporary file(s) and rename. Disable this option if your SFTP server doesn&#39;t support rename operation. Type: boolean (or Expression with resultType boolean).
     * 
     */
    private final @Nullable Object useTempFileRename;

    @CustomType.Constructor
    private SftpWriteSettingsResponse(
        @CustomType.Parameter("copyBehavior") @Nullable Object copyBehavior,
        @CustomType.Parameter("disableMetricsCollection") @Nullable Object disableMetricsCollection,
        @CustomType.Parameter("maxConcurrentConnections") @Nullable Object maxConcurrentConnections,
        @CustomType.Parameter("operationTimeout") @Nullable Object operationTimeout,
        @CustomType.Parameter("type") String type,
        @CustomType.Parameter("useTempFileRename") @Nullable Object useTempFileRename) {
        this.copyBehavior = copyBehavior;
        this.disableMetricsCollection = disableMetricsCollection;
        this.maxConcurrentConnections = maxConcurrentConnections;
        this.operationTimeout = operationTimeout;
        this.type = type;
        this.useTempFileRename = useTempFileRename;
    }

    /**
     * @return The type of copy behavior for copy sink.
     * 
     */
    public Optional<Object> copyBehavior() {
        return Optional.ofNullable(this.copyBehavior);
    }
    /**
     * @return If true, disable data store metrics collection. Default is false. Type: boolean (or Expression with resultType boolean).
     * 
     */
    public Optional<Object> disableMetricsCollection() {
        return Optional.ofNullable(this.disableMetricsCollection);
    }
    /**
     * @return The maximum concurrent connection count for the source data store. Type: integer (or Expression with resultType integer).
     * 
     */
    public Optional<Object> maxConcurrentConnections() {
        return Optional.ofNullable(this.maxConcurrentConnections);
    }
    /**
     * @return Specifies the timeout for writing each chunk to SFTP server. Default value: 01:00:00 (one hour). Type: string (or Expression with resultType string).
     * 
     */
    public Optional<Object> operationTimeout() {
        return Optional.ofNullable(this.operationTimeout);
    }
    /**
     * @return The write setting type.
     * Expected value is &#39;SftpWriteSettings&#39;.
     * 
     */
    public String type() {
        return this.type;
    }
    /**
     * @return Upload to temporary file(s) and rename. Disable this option if your SFTP server doesn&#39;t support rename operation. Type: boolean (or Expression with resultType boolean).
     * 
     */
    public Optional<Object> useTempFileRename() {
        return Optional.ofNullable(this.useTempFileRename);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SftpWriteSettingsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Object copyBehavior;
        private @Nullable Object disableMetricsCollection;
        private @Nullable Object maxConcurrentConnections;
        private @Nullable Object operationTimeout;
        private String type;
        private @Nullable Object useTempFileRename;

        public Builder() {
    	      // Empty
        }

        public Builder(SftpWriteSettingsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.copyBehavior = defaults.copyBehavior;
    	      this.disableMetricsCollection = defaults.disableMetricsCollection;
    	      this.maxConcurrentConnections = defaults.maxConcurrentConnections;
    	      this.operationTimeout = defaults.operationTimeout;
    	      this.type = defaults.type;
    	      this.useTempFileRename = defaults.useTempFileRename;
        }

        public Builder copyBehavior(@Nullable Object copyBehavior) {
            this.copyBehavior = copyBehavior;
            return this;
        }
        public Builder disableMetricsCollection(@Nullable Object disableMetricsCollection) {
            this.disableMetricsCollection = disableMetricsCollection;
            return this;
        }
        public Builder maxConcurrentConnections(@Nullable Object maxConcurrentConnections) {
            this.maxConcurrentConnections = maxConcurrentConnections;
            return this;
        }
        public Builder operationTimeout(@Nullable Object operationTimeout) {
            this.operationTimeout = operationTimeout;
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder useTempFileRename(@Nullable Object useTempFileRename) {
            this.useTempFileRename = useTempFileRename;
            return this;
        }        public SftpWriteSettingsResponse build() {
            return new SftpWriteSettingsResponse(copyBehavior, disableMetricsCollection, maxConcurrentConnections, operationTimeout, type, useTempFileRename);
        }
    }
}
