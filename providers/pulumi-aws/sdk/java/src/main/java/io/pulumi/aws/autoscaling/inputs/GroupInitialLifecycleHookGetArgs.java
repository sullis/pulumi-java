// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.autoscaling.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class GroupInitialLifecycleHookGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final GroupInitialLifecycleHookGetArgs Empty = new GroupInitialLifecycleHookGetArgs();

    @Import(name="defaultResult")
      private final @Nullable Output<String> defaultResult;

    public Output<String> getDefaultResult() {
        return this.defaultResult == null ? Output.empty() : this.defaultResult;
    }

    @Import(name="heartbeatTimeout")
      private final @Nullable Output<Integer> heartbeatTimeout;

    public Output<Integer> getHeartbeatTimeout() {
        return this.heartbeatTimeout == null ? Output.empty() : this.heartbeatTimeout;
    }

    @Import(name="lifecycleTransition", required=true)
      private final Output<String> lifecycleTransition;

    public Output<String> getLifecycleTransition() {
        return this.lifecycleTransition;
    }

    /**
     * The name of the Auto Scaling Group. By default generated by this provider. Conflicts with `name_prefix`.
     * 
     */
    @Import(name="name", required=true)
      private final Output<String> name;

    public Output<String> getName() {
        return this.name;
    }

    @Import(name="notificationMetadata")
      private final @Nullable Output<String> notificationMetadata;

    public Output<String> getNotificationMetadata() {
        return this.notificationMetadata == null ? Output.empty() : this.notificationMetadata;
    }

    @Import(name="notificationTargetArn")
      private final @Nullable Output<String> notificationTargetArn;

    public Output<String> getNotificationTargetArn() {
        return this.notificationTargetArn == null ? Output.empty() : this.notificationTargetArn;
    }

    @Import(name="roleArn")
      private final @Nullable Output<String> roleArn;

    public Output<String> getRoleArn() {
        return this.roleArn == null ? Output.empty() : this.roleArn;
    }

    public GroupInitialLifecycleHookGetArgs(
        @Nullable Output<String> defaultResult,
        @Nullable Output<Integer> heartbeatTimeout,
        Output<String> lifecycleTransition,
        Output<String> name,
        @Nullable Output<String> notificationMetadata,
        @Nullable Output<String> notificationTargetArn,
        @Nullable Output<String> roleArn) {
        this.defaultResult = defaultResult;
        this.heartbeatTimeout = heartbeatTimeout;
        this.lifecycleTransition = Objects.requireNonNull(lifecycleTransition, "expected parameter 'lifecycleTransition' to be non-null");
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.notificationMetadata = notificationMetadata;
        this.notificationTargetArn = notificationTargetArn;
        this.roleArn = roleArn;
    }

    private GroupInitialLifecycleHookGetArgs() {
        this.defaultResult = Output.empty();
        this.heartbeatTimeout = Output.empty();
        this.lifecycleTransition = Output.empty();
        this.name = Output.empty();
        this.notificationMetadata = Output.empty();
        this.notificationTargetArn = Output.empty();
        this.roleArn = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GroupInitialLifecycleHookGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> defaultResult;
        private @Nullable Output<Integer> heartbeatTimeout;
        private Output<String> lifecycleTransition;
        private Output<String> name;
        private @Nullable Output<String> notificationMetadata;
        private @Nullable Output<String> notificationTargetArn;
        private @Nullable Output<String> roleArn;

        public Builder() {
    	      // Empty
        }

        public Builder(GroupInitialLifecycleHookGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.defaultResult = defaults.defaultResult;
    	      this.heartbeatTimeout = defaults.heartbeatTimeout;
    	      this.lifecycleTransition = defaults.lifecycleTransition;
    	      this.name = defaults.name;
    	      this.notificationMetadata = defaults.notificationMetadata;
    	      this.notificationTargetArn = defaults.notificationTargetArn;
    	      this.roleArn = defaults.roleArn;
        }

        public Builder defaultResult(@Nullable Output<String> defaultResult) {
            this.defaultResult = defaultResult;
            return this;
        }
        public Builder defaultResult(@Nullable String defaultResult) {
            this.defaultResult = Output.ofNullable(defaultResult);
            return this;
        }
        public Builder heartbeatTimeout(@Nullable Output<Integer> heartbeatTimeout) {
            this.heartbeatTimeout = heartbeatTimeout;
            return this;
        }
        public Builder heartbeatTimeout(@Nullable Integer heartbeatTimeout) {
            this.heartbeatTimeout = Output.ofNullable(heartbeatTimeout);
            return this;
        }
        public Builder lifecycleTransition(Output<String> lifecycleTransition) {
            this.lifecycleTransition = Objects.requireNonNull(lifecycleTransition);
            return this;
        }
        public Builder lifecycleTransition(String lifecycleTransition) {
            this.lifecycleTransition = Output.of(Objects.requireNonNull(lifecycleTransition));
            return this;
        }
        public Builder name(Output<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder name(String name) {
            this.name = Output.of(Objects.requireNonNull(name));
            return this;
        }
        public Builder notificationMetadata(@Nullable Output<String> notificationMetadata) {
            this.notificationMetadata = notificationMetadata;
            return this;
        }
        public Builder notificationMetadata(@Nullable String notificationMetadata) {
            this.notificationMetadata = Output.ofNullable(notificationMetadata);
            return this;
        }
        public Builder notificationTargetArn(@Nullable Output<String> notificationTargetArn) {
            this.notificationTargetArn = notificationTargetArn;
            return this;
        }
        public Builder notificationTargetArn(@Nullable String notificationTargetArn) {
            this.notificationTargetArn = Output.ofNullable(notificationTargetArn);
            return this;
        }
        public Builder roleArn(@Nullable Output<String> roleArn) {
            this.roleArn = roleArn;
            return this;
        }
        public Builder roleArn(@Nullable String roleArn) {
            this.roleArn = Output.ofNullable(roleArn);
            return this;
        }        public GroupInitialLifecycleHookGetArgs build() {
            return new GroupInitialLifecycleHookGetArgs(defaultResult, heartbeatTimeout, lifecycleTransition, name, notificationMetadata, notificationTargetArn, roleArn);
        }
    }
}
