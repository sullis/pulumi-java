// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.logic.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class WorkflowTriggerListCallbackUrlQueriesResponse {
    /**
     * @return The api version.
     * 
     */
    private final @Nullable String apiVersion;
    /**
     * @return The SAS timestamp.
     * 
     */
    private final @Nullable String se;
    /**
     * @return The SAS signature.
     * 
     */
    private final @Nullable String sig;
    /**
     * @return The SAS permissions.
     * 
     */
    private final @Nullable String sp;
    /**
     * @return The SAS version.
     * 
     */
    private final @Nullable String sv;

    @CustomType.Constructor
    private WorkflowTriggerListCallbackUrlQueriesResponse(
        @CustomType.Parameter("apiVersion") @Nullable String apiVersion,
        @CustomType.Parameter("se") @Nullable String se,
        @CustomType.Parameter("sig") @Nullable String sig,
        @CustomType.Parameter("sp") @Nullable String sp,
        @CustomType.Parameter("sv") @Nullable String sv) {
        this.apiVersion = apiVersion;
        this.se = se;
        this.sig = sig;
        this.sp = sp;
        this.sv = sv;
    }

    /**
     * @return The api version.
     * 
     */
    public Optional<String> apiVersion() {
        return Optional.ofNullable(this.apiVersion);
    }
    /**
     * @return The SAS timestamp.
     * 
     */
    public Optional<String> se() {
        return Optional.ofNullable(this.se);
    }
    /**
     * @return The SAS signature.
     * 
     */
    public Optional<String> sig() {
        return Optional.ofNullable(this.sig);
    }
    /**
     * @return The SAS permissions.
     * 
     */
    public Optional<String> sp() {
        return Optional.ofNullable(this.sp);
    }
    /**
     * @return The SAS version.
     * 
     */
    public Optional<String> sv() {
        return Optional.ofNullable(this.sv);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WorkflowTriggerListCallbackUrlQueriesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String apiVersion;
        private @Nullable String se;
        private @Nullable String sig;
        private @Nullable String sp;
        private @Nullable String sv;

        public Builder() {
    	      // Empty
        }

        public Builder(WorkflowTriggerListCallbackUrlQueriesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apiVersion = defaults.apiVersion;
    	      this.se = defaults.se;
    	      this.sig = defaults.sig;
    	      this.sp = defaults.sp;
    	      this.sv = defaults.sv;
        }

        public Builder apiVersion(@Nullable String apiVersion) {
            this.apiVersion = apiVersion;
            return this;
        }
        public Builder se(@Nullable String se) {
            this.se = se;
            return this;
        }
        public Builder sig(@Nullable String sig) {
            this.sig = sig;
            return this;
        }
        public Builder sp(@Nullable String sp) {
            this.sp = sp;
            return this;
        }
        public Builder sv(@Nullable String sv) {
            this.sv = sv;
            return this;
        }        public WorkflowTriggerListCallbackUrlQueriesResponse build() {
            return new WorkflowTriggerListCallbackUrlQueriesResponse(apiVersion, se, sig, sp, sv);
        }
    }
}
