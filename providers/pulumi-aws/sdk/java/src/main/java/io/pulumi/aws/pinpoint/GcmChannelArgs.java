// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.pinpoint;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class GcmChannelArgs extends io.pulumi.resources.ResourceArgs {

    public static final GcmChannelArgs Empty = new GcmChannelArgs();

    /**
     * Platform credential API key from Google.
     * 
     */
    @Import(name="apiKey", required=true)
      private final Output<String> apiKey;

    public Output<String> apiKey() {
        return this.apiKey;
    }

    /**
     * The application ID.
     * 
     */
    @Import(name="applicationId", required=true)
      private final Output<String> applicationId;

    public Output<String> applicationId() {
        return this.applicationId;
    }

    /**
     * Whether the channel is enabled or disabled. Defaults to `true`.
     * 
     */
    @Import(name="enabled")
      private final @Nullable Output<Boolean> enabled;

    public Output<Boolean> enabled() {
        return this.enabled == null ? Codegen.empty() : this.enabled;
    }

    public GcmChannelArgs(
        Output<String> apiKey,
        Output<String> applicationId,
        @Nullable Output<Boolean> enabled) {
        this.apiKey = Objects.requireNonNull(apiKey, "expected parameter 'apiKey' to be non-null");
        this.applicationId = Objects.requireNonNull(applicationId, "expected parameter 'applicationId' to be non-null");
        this.enabled = enabled;
    }

    private GcmChannelArgs() {
        this.apiKey = Codegen.empty();
        this.applicationId = Codegen.empty();
        this.enabled = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GcmChannelArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> apiKey;
        private Output<String> applicationId;
        private @Nullable Output<Boolean> enabled;

        public Builder() {
    	      // Empty
        }

        public Builder(GcmChannelArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apiKey = defaults.apiKey;
    	      this.applicationId = defaults.applicationId;
    	      this.enabled = defaults.enabled;
        }

        public Builder apiKey(Output<String> apiKey) {
            this.apiKey = Objects.requireNonNull(apiKey);
            return this;
        }
        public Builder apiKey(String apiKey) {
            this.apiKey = Output.of(Objects.requireNonNull(apiKey));
            return this;
        }
        public Builder applicationId(Output<String> applicationId) {
            this.applicationId = Objects.requireNonNull(applicationId);
            return this;
        }
        public Builder applicationId(String applicationId) {
            this.applicationId = Output.of(Objects.requireNonNull(applicationId));
            return this;
        }
        public Builder enabled(@Nullable Output<Boolean> enabled) {
            this.enabled = enabled;
            return this;
        }
        public Builder enabled(@Nullable Boolean enabled) {
            this.enabled = Codegen.ofNullable(enabled);
            return this;
        }        public GcmChannelArgs build() {
            return new GcmChannelArgs(apiKey, applicationId, enabled);
        }
    }
}
