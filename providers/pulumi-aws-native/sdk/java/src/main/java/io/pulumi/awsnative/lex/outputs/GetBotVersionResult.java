// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.lex.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetBotVersionResult {
    private final @Nullable String botVersion;
    private final @Nullable String description;

    @OutputCustomType.Constructor({"botVersion","description"})
    private GetBotVersionResult(
        @Nullable String botVersion,
        @Nullable String description) {
        this.botVersion = botVersion;
        this.description = description;
    }

    public Optional<String> getBotVersion() {
        return Optional.ofNullable(this.botVersion);
    }
    public Optional<String> getDescription() {
        return Optional.ofNullable(this.description);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetBotVersionResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String botVersion;
        private @Nullable String description;

        public Builder() {
    	      // Empty
        }

        public Builder(GetBotVersionResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.botVersion = defaults.botVersion;
    	      this.description = defaults.description;
        }

        public Builder setBotVersion(@Nullable String botVersion) {
            this.botVersion = botVersion;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = description;
            return this;
        }

        public GetBotVersionResult build() {
            return new GetBotVersionResult(botVersion, description);
        }
    }
}
