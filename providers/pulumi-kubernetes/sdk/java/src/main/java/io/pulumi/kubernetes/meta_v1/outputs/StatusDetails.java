// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.meta_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.kubernetes.meta_v1.outputs.StatusCause;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class StatusDetails {
    /**
     * The Causes array includes more details associated with the StatusReason failure. Not all StatusReasons may provide detailed causes.
     * 
     */
    private final @Nullable List<StatusCause> causes;
    /**
     * The group attribute of the resource associated with the status StatusReason.
     * 
     */
    private final @Nullable String group;
    /**
     * The kind attribute of the resource associated with the status StatusReason. On some operations may differ from the requested resource Kind. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
     * 
     */
    private final @Nullable String kind;
    /**
     * The name attribute of the resource associated with the status StatusReason (when there is a single name which can be described).
     * 
     */
    private final @Nullable String name;
    /**
     * If specified, the time in seconds before the operation should be retried. Some errors may indicate the client must take an alternate action - for those errors this field may indicate how long to wait before taking the alternate action.
     * 
     */
    private final @Nullable Integer retryAfterSeconds;
    /**
     * UID of the resource. (when there is a single resource which can be described). More info: http://kubernetes.io/docs/user-guide/identifiers#uids
     * 
     */
    private final @Nullable String uid;

    @OutputCustomType.Constructor({"causes","group","kind","name","retryAfterSeconds","uid"})
    private StatusDetails(
        @Nullable List<StatusCause> causes,
        @Nullable String group,
        @Nullable String kind,
        @Nullable String name,
        @Nullable Integer retryAfterSeconds,
        @Nullable String uid) {
        this.causes = causes;
        this.group = group;
        this.kind = kind;
        this.name = name;
        this.retryAfterSeconds = retryAfterSeconds;
        this.uid = uid;
    }

    /**
     * The Causes array includes more details associated with the StatusReason failure. Not all StatusReasons may provide detailed causes.
     * 
    */
    public List<StatusCause> getCauses() {
        return this.causes == null ? List.of() : this.causes;
    }
    /**
     * The group attribute of the resource associated with the status StatusReason.
     * 
    */
    public Optional<String> getGroup() {
        return Optional.ofNullable(this.group);
    }
    /**
     * The kind attribute of the resource associated with the status StatusReason. On some operations may differ from the requested resource Kind. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
     * 
    */
    public Optional<String> getKind() {
        return Optional.ofNullable(this.kind);
    }
    /**
     * The name attribute of the resource associated with the status StatusReason (when there is a single name which can be described).
     * 
    */
    public Optional<String> getName() {
        return Optional.ofNullable(this.name);
    }
    /**
     * If specified, the time in seconds before the operation should be retried. Some errors may indicate the client must take an alternate action - for those errors this field may indicate how long to wait before taking the alternate action.
     * 
    */
    public Optional<Integer> getRetryAfterSeconds() {
        return Optional.ofNullable(this.retryAfterSeconds);
    }
    /**
     * UID of the resource. (when there is a single resource which can be described). More info: http://kubernetes.io/docs/user-guide/identifiers#uids
     * 
    */
    public Optional<String> getUid() {
        return Optional.ofNullable(this.uid);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StatusDetails defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<StatusCause> causes;
        private @Nullable String group;
        private @Nullable String kind;
        private @Nullable String name;
        private @Nullable Integer retryAfterSeconds;
        private @Nullable String uid;

        public Builder() {
    	      // Empty
        }

        public Builder(StatusDetails defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.causes = defaults.causes;
    	      this.group = defaults.group;
    	      this.kind = defaults.kind;
    	      this.name = defaults.name;
    	      this.retryAfterSeconds = defaults.retryAfterSeconds;
    	      this.uid = defaults.uid;
        }

        public Builder setCauses(@Nullable List<StatusCause> causes) {
            this.causes = causes;
            return this;
        }

        public Builder setGroup(@Nullable String group) {
            this.group = group;
            return this;
        }

        public Builder setKind(@Nullable String kind) {
            this.kind = kind;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = name;
            return this;
        }

        public Builder setRetryAfterSeconds(@Nullable Integer retryAfterSeconds) {
            this.retryAfterSeconds = retryAfterSeconds;
            return this;
        }

        public Builder setUid(@Nullable String uid) {
            this.uid = uid;
            return this;
        }
        public StatusDetails build() {
            return new StatusDetails(causes, group, kind, name, retryAfterSeconds, uid);
        }
    }
}