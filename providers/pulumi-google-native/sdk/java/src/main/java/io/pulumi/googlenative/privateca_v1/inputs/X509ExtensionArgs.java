// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.privateca_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.privateca_v1.inputs.ObjectIdArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * An X509Extension specifies an X.509 extension, which may be used in different parts of X.509 objects like certificates, CSRs, and CRLs.
 * 
 */
public final class X509ExtensionArgs extends io.pulumi.resources.ResourceArgs {

    public static final X509ExtensionArgs Empty = new X509ExtensionArgs();

    /**
     * Optional. Indicates whether or not this extension is critical (i.e., if the client does not know how to handle this extension, the client should consider this to be an error).
     * 
     */
    @InputImport(name="critical")
      private final @Nullable Input<Boolean> critical;

    public Input<Boolean> getCritical() {
        return this.critical == null ? Input.empty() : this.critical;
    }

    /**
     * The OID for this X.509 extension.
     * 
     */
    @InputImport(name="objectId", required=true)
      private final Input<ObjectIdArgs> objectId;

    public Input<ObjectIdArgs> getObjectId() {
        return this.objectId;
    }

    /**
     * The value of this X.509 extension.
     * 
     */
    @InputImport(name="value", required=true)
      private final Input<String> value;

    public Input<String> getValue() {
        return this.value;
    }

    public X509ExtensionArgs(
        @Nullable Input<Boolean> critical,
        Input<ObjectIdArgs> objectId,
        Input<String> value) {
        this.critical = critical;
        this.objectId = Objects.requireNonNull(objectId, "expected parameter 'objectId' to be non-null");
        this.value = Objects.requireNonNull(value, "expected parameter 'value' to be non-null");
    }

    private X509ExtensionArgs() {
        this.critical = Input.empty();
        this.objectId = Input.empty();
        this.value = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(X509ExtensionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Boolean> critical;
        private Input<ObjectIdArgs> objectId;
        private Input<String> value;

        public Builder() {
    	      // Empty
        }

        public Builder(X509ExtensionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.critical = defaults.critical;
    	      this.objectId = defaults.objectId;
    	      this.value = defaults.value;
        }

        public Builder setCritical(@Nullable Input<Boolean> critical) {
            this.critical = critical;
            return this;
        }

        public Builder setCritical(@Nullable Boolean critical) {
            this.critical = Input.ofNullable(critical);
            return this;
        }

        public Builder setObjectId(Input<ObjectIdArgs> objectId) {
            this.objectId = Objects.requireNonNull(objectId);
            return this;
        }

        public Builder setObjectId(ObjectIdArgs objectId) {
            this.objectId = Input.of(Objects.requireNonNull(objectId));
            return this;
        }

        public Builder setValue(Input<String> value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }

        public Builder setValue(String value) {
            this.value = Input.of(Objects.requireNonNull(value));
            return this;
        }
        public X509ExtensionArgs build() {
            return new X509ExtensionArgs(critical, objectId, value);
        }
    }
}