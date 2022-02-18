// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.route53;

import io.pulumi.awsnative.route53.enums.KeySigningKeyStatus;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class KeySigningKeyArgs extends io.pulumi.resources.ResourceArgs {

    public static final KeySigningKeyArgs Empty = new KeySigningKeyArgs();

    /**
     * The unique string (ID) used to identify a hosted zone.
     * 
     */
    @InputImport(name="hostedZoneId", required=true)
    private final Input<String> hostedZoneId;

    public Input<String> getHostedZoneId() {
        return this.hostedZoneId;
    }

    /**
     * The Amazon resource name (ARN) for a customer managed key (CMK) in AWS Key Management Service (KMS). The KeyManagementServiceArn must be unique for each key signing key (KSK) in a single hosted zone.
     * 
     */
    @InputImport(name="keyManagementServiceArn", required=true)
    private final Input<String> keyManagementServiceArn;

    public Input<String> getKeyManagementServiceArn() {
        return this.keyManagementServiceArn;
    }

    /**
     * An alphanumeric string used to identify a key signing key (KSK). Name must be unique for each key signing key in the same hosted zone.
     * 
     */
    @InputImport(name="name")
    private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * A string specifying the initial status of the key signing key (KSK). You can set the value to ACTIVE or INACTIVE.
     * 
     */
    @InputImport(name="status", required=true)
    private final Input<KeySigningKeyStatus> status;

    public Input<KeySigningKeyStatus> getStatus() {
        return this.status;
    }

    public KeySigningKeyArgs(
        Input<String> hostedZoneId,
        Input<String> keyManagementServiceArn,
        @Nullable Input<String> name,
        Input<KeySigningKeyStatus> status) {
        this.hostedZoneId = Objects.requireNonNull(hostedZoneId, "expected parameter 'hostedZoneId' to be non-null");
        this.keyManagementServiceArn = Objects.requireNonNull(keyManagementServiceArn, "expected parameter 'keyManagementServiceArn' to be non-null");
        this.name = name;
        this.status = Objects.requireNonNull(status, "expected parameter 'status' to be non-null");
    }

    private KeySigningKeyArgs() {
        this.hostedZoneId = Input.empty();
        this.keyManagementServiceArn = Input.empty();
        this.name = Input.empty();
        this.status = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(KeySigningKeyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> hostedZoneId;
        private Input<String> keyManagementServiceArn;
        private @Nullable Input<String> name;
        private Input<KeySigningKeyStatus> status;

        public Builder() {
    	      // Empty
        }

        public Builder(KeySigningKeyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.hostedZoneId = defaults.hostedZoneId;
    	      this.keyManagementServiceArn = defaults.keyManagementServiceArn;
    	      this.name = defaults.name;
    	      this.status = defaults.status;
        }

        public Builder setHostedZoneId(Input<String> hostedZoneId) {
            this.hostedZoneId = Objects.requireNonNull(hostedZoneId);
            return this;
        }

        public Builder setHostedZoneId(String hostedZoneId) {
            this.hostedZoneId = Input.of(Objects.requireNonNull(hostedZoneId));
            return this;
        }

        public Builder setKeyManagementServiceArn(Input<String> keyManagementServiceArn) {
            this.keyManagementServiceArn = Objects.requireNonNull(keyManagementServiceArn);
            return this;
        }

        public Builder setKeyManagementServiceArn(String keyManagementServiceArn) {
            this.keyManagementServiceArn = Input.of(Objects.requireNonNull(keyManagementServiceArn));
            return this;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setStatus(Input<KeySigningKeyStatus> status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }

        public Builder setStatus(KeySigningKeyStatus status) {
            this.status = Input.of(Objects.requireNonNull(status));
            return this;
        }

        public KeySigningKeyArgs build() {
            return new KeySigningKeyArgs(hostedZoneId, keyManagementServiceArn, name, status);
        }
    }
}
