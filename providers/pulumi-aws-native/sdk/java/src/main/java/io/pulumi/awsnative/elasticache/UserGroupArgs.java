// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.elasticache;

import io.pulumi.awsnative.elasticache.enums.UserGroupEngine;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class UserGroupArgs extends io.pulumi.resources.ResourceArgs {

    public static final UserGroupArgs Empty = new UserGroupArgs();

    /**
     * Must be redis.
     * 
     */
    @InputImport(name="engine", required=true)
    private final Input<UserGroupEngine> engine;

    public Input<UserGroupEngine> getEngine() {
        return this.engine;
    }

    /**
     * The ID of the user group.
     * 
     */
    @InputImport(name="userGroupId", required=true)
    private final Input<String> userGroupId;

    public Input<String> getUserGroupId() {
        return this.userGroupId;
    }

    /**
     * List of users associated to this user group.
     * 
     */
    @InputImport(name="userIds")
    private final @Nullable Input<List<String>> userIds;

    public Input<List<String>> getUserIds() {
        return this.userIds == null ? Input.empty() : this.userIds;
    }

    public UserGroupArgs(
        Input<UserGroupEngine> engine,
        Input<String> userGroupId,
        @Nullable Input<List<String>> userIds) {
        this.engine = Objects.requireNonNull(engine, "expected parameter 'engine' to be non-null");
        this.userGroupId = Objects.requireNonNull(userGroupId, "expected parameter 'userGroupId' to be non-null");
        this.userIds = userIds;
    }

    private UserGroupArgs() {
        this.engine = Input.empty();
        this.userGroupId = Input.empty();
        this.userIds = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UserGroupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<UserGroupEngine> engine;
        private Input<String> userGroupId;
        private @Nullable Input<List<String>> userIds;

        public Builder() {
    	      // Empty
        }

        public Builder(UserGroupArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.engine = defaults.engine;
    	      this.userGroupId = defaults.userGroupId;
    	      this.userIds = defaults.userIds;
        }

        public Builder setEngine(Input<UserGroupEngine> engine) {
            this.engine = Objects.requireNonNull(engine);
            return this;
        }

        public Builder setEngine(UserGroupEngine engine) {
            this.engine = Input.of(Objects.requireNonNull(engine));
            return this;
        }

        public Builder setUserGroupId(Input<String> userGroupId) {
            this.userGroupId = Objects.requireNonNull(userGroupId);
            return this;
        }

        public Builder setUserGroupId(String userGroupId) {
            this.userGroupId = Input.of(Objects.requireNonNull(userGroupId));
            return this;
        }

        public Builder setUserIds(@Nullable Input<List<String>> userIds) {
            this.userIds = userIds;
            return this;
        }

        public Builder setUserIds(@Nullable List<String> userIds) {
            this.userIds = Input.ofNullable(userIds);
            return this;
        }

        public UserGroupArgs build() {
            return new UserGroupArgs(engine, userGroupId, userIds);
        }
    }
}
