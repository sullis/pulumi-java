// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iot.outputs;

import io.pulumi.awsnative.iot.enums.MitigationActionUpdateCACertificateParamsAction;
import io.pulumi.core.annotations.CustomType;
import java.util.Objects;

@CustomType
public final class MitigationActionUpdateCACertificateParams {
    private final MitigationActionUpdateCACertificateParamsAction action;

    @CustomType.Constructor
    private MitigationActionUpdateCACertificateParams(@CustomType.Parameter("action") MitigationActionUpdateCACertificateParamsAction action) {
        this.action = action;
    }

    public MitigationActionUpdateCACertificateParamsAction action() {
        return this.action;
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

        public Builder action(MitigationActionUpdateCACertificateParamsAction action) {
            this.action = Objects.requireNonNull(action);
            return this;
        }        public MitigationActionUpdateCACertificateParams build() {
            return new MitigationActionUpdateCACertificateParams(action);
        }
    }
}
