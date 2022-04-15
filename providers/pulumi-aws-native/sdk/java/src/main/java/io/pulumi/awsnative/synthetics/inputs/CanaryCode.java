// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.synthetics.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class CanaryCode extends io.pulumi.resources.InvokeArgs {

    public static final CanaryCode Empty = new CanaryCode();

    @Import(name="handler", required=true)
      private final String handler;

    public String handler() {
        return this.handler;
    }

    @Import(name="s3Bucket")
      private final @Nullable String s3Bucket;

    public Optional<String> s3Bucket() {
        return this.s3Bucket == null ? Optional.empty() : Optional.ofNullable(this.s3Bucket);
    }

    @Import(name="s3Key")
      private final @Nullable String s3Key;

    public Optional<String> s3Key() {
        return this.s3Key == null ? Optional.empty() : Optional.ofNullable(this.s3Key);
    }

    @Import(name="s3ObjectVersion")
      private final @Nullable String s3ObjectVersion;

    public Optional<String> s3ObjectVersion() {
        return this.s3ObjectVersion == null ? Optional.empty() : Optional.ofNullable(this.s3ObjectVersion);
    }

    @Import(name="script")
      private final @Nullable String script;

    public Optional<String> script() {
        return this.script == null ? Optional.empty() : Optional.ofNullable(this.script);
    }

    public CanaryCode(
        String handler,
        @Nullable String s3Bucket,
        @Nullable String s3Key,
        @Nullable String s3ObjectVersion,
        @Nullable String script) {
        this.handler = Objects.requireNonNull(handler, "expected parameter 'handler' to be non-null");
        this.s3Bucket = s3Bucket;
        this.s3Key = s3Key;
        this.s3ObjectVersion = s3ObjectVersion;
        this.script = script;
    }

    private CanaryCode() {
        this.handler = null;
        this.s3Bucket = null;
        this.s3Key = null;
        this.s3ObjectVersion = null;
        this.script = null;
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

        public Builder handler(String handler) {
            this.handler = Objects.requireNonNull(handler);
            return this;
        }
        public Builder s3Bucket(@Nullable String s3Bucket) {
            this.s3Bucket = s3Bucket;
            return this;
        }
        public Builder s3Key(@Nullable String s3Key) {
            this.s3Key = s3Key;
            return this;
        }
        public Builder s3ObjectVersion(@Nullable String s3ObjectVersion) {
            this.s3ObjectVersion = s3ObjectVersion;
            return this;
        }
        public Builder script(@Nullable String script) {
            this.script = script;
            return this;
        }        public CanaryCode build() {
            return new CanaryCode(handler, s3Bucket, s3Key, s3ObjectVersion, script);
        }
    }
}
