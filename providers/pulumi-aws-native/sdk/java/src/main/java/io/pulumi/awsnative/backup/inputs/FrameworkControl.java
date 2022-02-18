// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.backup.inputs;

import io.pulumi.awsnative.backup.inputs.FrameworkControlControlScopeProperties;
import io.pulumi.awsnative.backup.inputs.FrameworkControlInputParameter;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class FrameworkControl extends io.pulumi.resources.InvokeArgs {

    public static final FrameworkControl Empty = new FrameworkControl();

    /**
     * A list of ParameterName and ParameterValue pairs.
     * 
     */
    @InputImport(name="controlInputParameters")
    private final @Nullable List<FrameworkControlInputParameter> controlInputParameters;

    public List<FrameworkControlInputParameter> getControlInputParameters() {
        return this.controlInputParameters == null ? List.of() : this.controlInputParameters;
    }

    /**
     * The name of a control. This name is between 1 and 256 characters.
     * 
     */
    @InputImport(name="controlName", required=true)
    private final String controlName;

    public String getControlName() {
        return this.controlName;
    }

    /**
     * The scope of a control. The control scope defines what the control will evaluate. Three examples of control scopes are: a specific backup plan, all backup plans with a specific tag, or all backup plans.
     * 
     */
    @InputImport(name="controlScope")
    private final @Nullable FrameworkControlControlScopeProperties controlScope;

    public Optional<FrameworkControlControlScopeProperties> getControlScope() {
        return this.controlScope == null ? Optional.empty() : Optional.ofNullable(this.controlScope);
    }

    public FrameworkControl(
        @Nullable List<FrameworkControlInputParameter> controlInputParameters,
        String controlName,
        @Nullable FrameworkControlControlScopeProperties controlScope) {
        this.controlInputParameters = controlInputParameters;
        this.controlName = Objects.requireNonNull(controlName, "expected parameter 'controlName' to be non-null");
        this.controlScope = controlScope;
    }

    private FrameworkControl() {
        this.controlInputParameters = List.of();
        this.controlName = null;
        this.controlScope = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FrameworkControl defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<FrameworkControlInputParameter> controlInputParameters;
        private String controlName;
        private @Nullable FrameworkControlControlScopeProperties controlScope;

        public Builder() {
    	      // Empty
        }

        public Builder(FrameworkControl defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.controlInputParameters = defaults.controlInputParameters;
    	      this.controlName = defaults.controlName;
    	      this.controlScope = defaults.controlScope;
        }

        public Builder setControlInputParameters(@Nullable List<FrameworkControlInputParameter> controlInputParameters) {
            this.controlInputParameters = controlInputParameters;
            return this;
        }

        public Builder setControlName(String controlName) {
            this.controlName = Objects.requireNonNull(controlName);
            return this;
        }

        public Builder setControlScope(@Nullable FrameworkControlControlScopeProperties controlScope) {
            this.controlScope = controlScope;
            return this;
        }

        public FrameworkControl build() {
            return new FrameworkControl(controlInputParameters, controlName, controlScope);
        }
    }
}
