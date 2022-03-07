// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.alertsmanagement.inputs;

import io.pulumi.azurenative.alertsmanagement.inputs.HealthStateResponse;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Specifies the health alert criteria to alert on.
 * 
 */
public final class VmGuestHealthAlertCriterionResponse extends io.pulumi.resources.InvokeArgs {

    public static final VmGuestHealthAlertCriterionResponse Empty = new VmGuestHealthAlertCriterionResponse();

    /**
     * Health states to alert on
     * 
     */
    @InputImport(name="healthStates", required=true)
      private final List<HealthStateResponse> healthStates;

    public List<HealthStateResponse> getHealthStates() {
        return this.healthStates;
    }

    /**
     * Names of health monitor on which to define alert
     * 
     */
    @InputImport(name="monitorNames")
      private final @Nullable List<String> monitorNames;

    public List<String> getMonitorNames() {
        return this.monitorNames == null ? List.of() : this.monitorNames;
    }

    /**
     * Names of health monitor type on which to define alert
     * 
     */
    @InputImport(name="monitorTypes")
      private final @Nullable List<String> monitorTypes;

    public List<String> getMonitorTypes() {
        return this.monitorTypes == null ? List.of() : this.monitorTypes;
    }

    /**
     * specifies the type of the alert criterion.
     * Expected value is 'GuestVmHealth'.
     * 
     */
    @InputImport(name="namespace", required=true)
      private final String namespace;

    public String getNamespace() {
        return this.namespace;
    }

    public VmGuestHealthAlertCriterionResponse(
        List<HealthStateResponse> healthStates,
        @Nullable List<String> monitorNames,
        @Nullable List<String> monitorTypes,
        String namespace) {
        this.healthStates = Objects.requireNonNull(healthStates, "expected parameter 'healthStates' to be non-null");
        this.monitorNames = monitorNames;
        this.monitorTypes = monitorTypes;
        this.namespace = Objects.requireNonNull(namespace, "expected parameter 'namespace' to be non-null");
    }

    private VmGuestHealthAlertCriterionResponse() {
        this.healthStates = List.of();
        this.monitorNames = List.of();
        this.monitorTypes = List.of();
        this.namespace = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VmGuestHealthAlertCriterionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<HealthStateResponse> healthStates;
        private @Nullable List<String> monitorNames;
        private @Nullable List<String> monitorTypes;
        private String namespace;

        public Builder() {
    	      // Empty
        }

        public Builder(VmGuestHealthAlertCriterionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.healthStates = defaults.healthStates;
    	      this.monitorNames = defaults.monitorNames;
    	      this.monitorTypes = defaults.monitorTypes;
    	      this.namespace = defaults.namespace;
        }

        public Builder setHealthStates(List<HealthStateResponse> healthStates) {
            this.healthStates = Objects.requireNonNull(healthStates);
            return this;
        }

        public Builder setMonitorNames(@Nullable List<String> monitorNames) {
            this.monitorNames = monitorNames;
            return this;
        }

        public Builder setMonitorTypes(@Nullable List<String> monitorTypes) {
            this.monitorTypes = monitorTypes;
            return this;
        }

        public Builder setNamespace(String namespace) {
            this.namespace = Objects.requireNonNull(namespace);
            return this;
        }
        public VmGuestHealthAlertCriterionResponse build() {
            return new VmGuestHealthAlertCriterionResponse(healthStates, monitorNames, monitorTypes, namespace);
        }
    }
}