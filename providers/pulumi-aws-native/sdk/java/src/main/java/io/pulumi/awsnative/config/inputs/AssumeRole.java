// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.config.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AssumeRole extends io.pulumi.resources.InvokeArgs {

    public static final AssumeRole Empty = new AssumeRole();

    @InputImport(name="durationSeconds")
    private final @Nullable Integer durationSeconds;

    public Optional<Integer> getDurationSeconds() {
        return this.durationSeconds == null ? Optional.empty() : Optional.ofNullable(this.durationSeconds);
    }

    @InputImport(name="externalId")
    private final @Nullable String externalId;

    public Optional<String> getExternalId() {
        return this.externalId == null ? Optional.empty() : Optional.ofNullable(this.externalId);
    }

    @InputImport(name="policy")
    private final @Nullable String policy;

    public Optional<String> getPolicy() {
        return this.policy == null ? Optional.empty() : Optional.ofNullable(this.policy);
    }

    @InputImport(name="policyArns")
    private final @Nullable List<String> policyArns;

    public List<String> getPolicyArns() {
        return this.policyArns == null ? List.of() : this.policyArns;
    }

    @InputImport(name="roleArn")
    private final @Nullable String roleArn;

    public Optional<String> getRoleArn() {
        return this.roleArn == null ? Optional.empty() : Optional.ofNullable(this.roleArn);
    }

    @InputImport(name="sessionName")
    private final @Nullable String sessionName;

    public Optional<String> getSessionName() {
        return this.sessionName == null ? Optional.empty() : Optional.ofNullable(this.sessionName);
    }

    @InputImport(name="tags")
    private final @Nullable Map<String,String> tags;

    public Map<String,String> getTags() {
        return this.tags == null ? Map.of() : this.tags;
    }

    @InputImport(name="transitiveTagKeys")
    private final @Nullable List<String> transitiveTagKeys;

    public List<String> getTransitiveTagKeys() {
        return this.transitiveTagKeys == null ? List.of() : this.transitiveTagKeys;
    }

    public AssumeRole(
        @Nullable Integer durationSeconds,
        @Nullable String externalId,
        @Nullable String policy,
        @Nullable List<String> policyArns,
        @Nullable String roleArn,
        @Nullable String sessionName,
        @Nullable Map<String,String> tags,
        @Nullable List<String> transitiveTagKeys) {
        this.durationSeconds = durationSeconds;
        this.externalId = externalId;
        this.policy = policy;
        this.policyArns = policyArns;
        this.roleArn = roleArn;
        this.sessionName = sessionName;
        this.tags = tags;
        this.transitiveTagKeys = transitiveTagKeys;
    }

    private AssumeRole() {
        this.durationSeconds = null;
        this.externalId = null;
        this.policy = null;
        this.policyArns = List.of();
        this.roleArn = null;
        this.sessionName = null;
        this.tags = Map.of();
        this.transitiveTagKeys = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AssumeRole defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer durationSeconds;
        private @Nullable String externalId;
        private @Nullable String policy;
        private @Nullable List<String> policyArns;
        private @Nullable String roleArn;
        private @Nullable String sessionName;
        private @Nullable Map<String,String> tags;
        private @Nullable List<String> transitiveTagKeys;

        public Builder() {
    	      // Empty
        }

        public Builder(AssumeRole defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.durationSeconds = defaults.durationSeconds;
    	      this.externalId = defaults.externalId;
    	      this.policy = defaults.policy;
    	      this.policyArns = defaults.policyArns;
    	      this.roleArn = defaults.roleArn;
    	      this.sessionName = defaults.sessionName;
    	      this.tags = defaults.tags;
    	      this.transitiveTagKeys = defaults.transitiveTagKeys;
        }

        public Builder setDurationSeconds(@Nullable Integer durationSeconds) {
            this.durationSeconds = durationSeconds;
            return this;
        }

        public Builder setExternalId(@Nullable String externalId) {
            this.externalId = externalId;
            return this;
        }

        public Builder setPolicy(@Nullable String policy) {
            this.policy = policy;
            return this;
        }

        public Builder setPolicyArns(@Nullable List<String> policyArns) {
            this.policyArns = policyArns;
            return this;
        }

        public Builder setRoleArn(@Nullable String roleArn) {
            this.roleArn = roleArn;
            return this;
        }

        public Builder setSessionName(@Nullable String sessionName) {
            this.sessionName = sessionName;
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTransitiveTagKeys(@Nullable List<String> transitiveTagKeys) {
            this.transitiveTagKeys = transitiveTagKeys;
            return this;
        }

        public AssumeRole build() {
            return new AssumeRole(durationSeconds, externalId, policy, policyArns, roleArn, sessionName, tags, transitiveTagKeys);
        }
    }
}
