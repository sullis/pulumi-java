// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.logic.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Gets the workflow trigger callback URL query parameters.
 * 
 */
public final class WorkflowTriggerListCallbackUrlQueriesResponse extends io.pulumi.resources.InvokeArgs {

    public static final WorkflowTriggerListCallbackUrlQueriesResponse Empty = new WorkflowTriggerListCallbackUrlQueriesResponse();

    /**
     * The api version.
     * 
     */
    @InputImport(name="apiVersion")
    private final @Nullable String apiVersion;

    public Optional<String> getApiVersion() {
        return this.apiVersion == null ? Optional.empty() : Optional.ofNullable(this.apiVersion);
    }

    /**
     * The SAS timestamp.
     * 
     */
    @InputImport(name="se")
    private final @Nullable String se;

    public Optional<String> getSe() {
        return this.se == null ? Optional.empty() : Optional.ofNullable(this.se);
    }

    /**
     * The SAS signature.
     * 
     */
    @InputImport(name="sig")
    private final @Nullable String sig;

    public Optional<String> getSig() {
        return this.sig == null ? Optional.empty() : Optional.ofNullable(this.sig);
    }

    /**
     * The SAS permissions.
     * 
     */
    @InputImport(name="sp")
    private final @Nullable String sp;

    public Optional<String> getSp() {
        return this.sp == null ? Optional.empty() : Optional.ofNullable(this.sp);
    }

    /**
     * The SAS version.
     * 
     */
    @InputImport(name="sv")
    private final @Nullable String sv;

    public Optional<String> getSv() {
        return this.sv == null ? Optional.empty() : Optional.ofNullable(this.sv);
    }

    public WorkflowTriggerListCallbackUrlQueriesResponse(
        @Nullable String apiVersion,
        @Nullable String se,
        @Nullable String sig,
        @Nullable String sp,
        @Nullable String sv) {
        this.apiVersion = apiVersion;
        this.se = se;
        this.sig = sig;
        this.sp = sp;
        this.sv = sv;
    }

    private WorkflowTriggerListCallbackUrlQueriesResponse() {
        this.apiVersion = null;
        this.se = null;
        this.sig = null;
        this.sp = null;
        this.sv = null;
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

        public Builder setApiVersion(@Nullable String apiVersion) {
            this.apiVersion = apiVersion;
            return this;
        }

        public Builder setSe(@Nullable String se) {
            this.se = se;
            return this;
        }

        public Builder setSig(@Nullable String sig) {
            this.sig = sig;
            return this;
        }

        public Builder setSp(@Nullable String sp) {
            this.sp = sp;
            return this;
        }

        public Builder setSv(@Nullable String sv) {
            this.sv = sv;
            return this;
        }

        public WorkflowTriggerListCallbackUrlQueriesResponse build() {
            return new WorkflowTriggerListCallbackUrlQueriesResponse(apiVersion, se, sig, sp, sv);
        }
    }
}
