// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.lex.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetBotVersionArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetBotVersionArgs Empty = new GetBotVersionArgs();

    @Import(name="botId", required=true)
      private final String botId;

    public String botId() {
        return this.botId;
    }

    @Import(name="botVersion", required=true)
      private final String botVersion;

    public String botVersion() {
        return this.botVersion;
    }

    public GetBotVersionArgs(
        String botId,
        String botVersion) {
        this.botId = Objects.requireNonNull(botId, "expected parameter 'botId' to be non-null");
        this.botVersion = Objects.requireNonNull(botVersion, "expected parameter 'botVersion' to be non-null");
    }

    private GetBotVersionArgs() {
        this.botId = null;
        this.botVersion = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetBotVersionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String botId;
        private String botVersion;

        public Builder() {
    	      // Empty
        }

        public Builder(GetBotVersionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.botId = defaults.botId;
    	      this.botVersion = defaults.botVersion;
        }

        public Builder botId(String botId) {
            this.botId = Objects.requireNonNull(botId);
            return this;
        }
        public Builder botVersion(String botVersion) {
            this.botVersion = Objects.requireNonNull(botVersion);
            return this;
        }        public GetBotVersionArgs build() {
            return new GetBotVersionArgs(botId, botVersion);
        }
    }
}
