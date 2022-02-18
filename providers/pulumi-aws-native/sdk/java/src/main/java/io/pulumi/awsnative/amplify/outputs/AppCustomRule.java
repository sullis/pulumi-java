// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.amplify.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class AppCustomRule {
    private final @Nullable String condition;
    private final String source;
    private final @Nullable String status;
    private final String target;

    @OutputCustomType.Constructor({"condition","source","status","target"})
    private AppCustomRule(
        @Nullable String condition,
        String source,
        @Nullable String status,
        String target) {
        this.condition = condition;
        this.source = Objects.requireNonNull(source);
        this.status = status;
        this.target = Objects.requireNonNull(target);
    }

    public Optional<String> getCondition() {
        return Optional.ofNullable(this.condition);
    }
    public String getSource() {
        return this.source;
    }
    public Optional<String> getStatus() {
        return Optional.ofNullable(this.status);
    }
    public String getTarget() {
        return this.target;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AppCustomRule defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String condition;
        private String source;
        private @Nullable String status;
        private String target;

        public Builder() {
    	      // Empty
        }

        public Builder(AppCustomRule defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.condition = defaults.condition;
    	      this.source = defaults.source;
    	      this.status = defaults.status;
    	      this.target = defaults.target;
        }

        public Builder setCondition(@Nullable String condition) {
            this.condition = condition;
            return this;
        }

        public Builder setSource(String source) {
            this.source = Objects.requireNonNull(source);
            return this;
        }

        public Builder setStatus(@Nullable String status) {
            this.status = status;
            return this;
        }

        public Builder setTarget(String target) {
            this.target = Objects.requireNonNull(target);
            return this;
        }

        public AppCustomRule build() {
            return new AppCustomRule(condition, source, status, target);
        }
    }
}
