// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.synthetics.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class CanaryCode {
    private final String handler;
    private final @Nullable String s3Bucket;
    private final @Nullable String s3Key;
    private final @Nullable String s3ObjectVersion;
    private final @Nullable String script;

    @OutputCustomType.Constructor({"handler","s3Bucket","s3Key","s3ObjectVersion","script"})
    private CanaryCode(
        String handler,
        @Nullable String s3Bucket,
        @Nullable String s3Key,
        @Nullable String s3ObjectVersion,
        @Nullable String script) {
        this.handler = Objects.requireNonNull(handler);
        this.s3Bucket = s3Bucket;
        this.s3Key = s3Key;
        this.s3ObjectVersion = s3ObjectVersion;
        this.script = script;
    }

    public String getHandler() {
        return this.handler;
    }
    public Optional<String> getS3Bucket() {
        return Optional.ofNullable(this.s3Bucket);
    }
    public Optional<String> getS3Key() {
        return Optional.ofNullable(this.s3Key);
    }
    public Optional<String> getS3ObjectVersion() {
        return Optional.ofNullable(this.s3ObjectVersion);
    }
    public Optional<String> getScript() {
        return Optional.ofNullable(this.script);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CanaryCode defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String handler;
        private @Nullable String s3Bucket;
        private @Nullable String s3Key;
        private @Nullable String s3ObjectVersion;
        private @Nullable String script;

        public Builder() {
    	      // Empty
        }

        public Builder(CanaryCode defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.handler = defaults.handler;
    	      this.s3Bucket = defaults.s3Bucket;
    	      this.s3Key = defaults.s3Key;
    	      this.s3ObjectVersion = defaults.s3ObjectVersion;
    	      this.script = defaults.script;
        }

        public Builder setHandler(String handler) {
            this.handler = Objects.requireNonNull(handler);
            return this;
        }

        public Builder setS3Bucket(@Nullable String s3Bucket) {
            this.s3Bucket = s3Bucket;
            return this;
        }

        public Builder setS3Key(@Nullable String s3Key) {
            this.s3Key = s3Key;
            return this;
        }

        public Builder setS3ObjectVersion(@Nullable String s3ObjectVersion) {
            this.s3ObjectVersion = s3ObjectVersion;
            return this;
        }

        public Builder setScript(@Nullable String script) {
            this.script = script;
            return this;
        }

        public CanaryCode build() {
            return new CanaryCode(handler, s3Bucket, s3Key, s3ObjectVersion, script);
        }
    }
}
