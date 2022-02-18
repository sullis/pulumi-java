// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iot.inputs;

import io.pulumi.awsnative.iot.enums.MitigationActionUpdateCACertificateParamsAction;
import io.pulumi.core.annotations.InputImport;
import java.util.Objects;


/**
 * Parameters to define a mitigation action that changes the state of the CA certificate to inactive.
 * 
 */
public final class MitigationActionUpdateCACertificateParams extends io.pulumi.resources.InvokeArgs {

    public static final MitigationActionUpdateCACertificateParams Empty = new MitigationActionUpdateCACertificateParams();

    @InputImport(name="action", required=true)
    private final MitigationActionUpdateCACertificateParamsAction action;

    public MitigationActionUpdateCACertificateParamsAction getAction() {
        return this.action;
    }

    public MitigationActionUpdateCACertificateParams(MitigationActionUpdateCACertificateParamsAction action) {
        this.action = Objects.requireNonNull(action, "expected parameter 'action' to be non-null");
    }

    private MitigationActionUpdateCACertificateParams() {
        this.action = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MitigationActionUpdateCACertificateParams defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MitigationActionUpdateCACertificateParamsAction action;

        public Builder() {
    	      // Empty
        }

        public Builder(MitigationActionUpdateCACertificateParams defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.action = defaults.action;
        }

        public Builder setAction(MitigationActionUpdateCACertificateParamsAction action) {
            this.action = Objects.requireNonNull(action);
            return this;
        }

        public MitigationActionUpdateCACertificateParams build() {
            return new MitigationActionUpdateCACertificateParams(action);
        }
    }
}
