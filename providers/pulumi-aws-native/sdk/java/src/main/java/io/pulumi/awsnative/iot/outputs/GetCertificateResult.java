// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iot.outputs;

import io.pulumi.awsnative.iot.enums.CertificateStatus;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetCertificateResult {
    private final @Nullable String arn;
    private final @Nullable String id;
    private final @Nullable CertificateStatus status;

    @OutputCustomType.Constructor({"arn","id","status"})
    private GetCertificateResult(
        @Nullable String arn,
        @Nullable String id,
        @Nullable CertificateStatus status) {
        this.arn = arn;
        this.id = id;
        this.status = status;
    }

    public Optional<String> getArn() {
        return Optional.ofNullable(this.arn);
    }
    public Optional<String> getId() {
        return Optional.ofNullable(this.id);
    }
    public Optional<CertificateStatus> getStatus() {
        return Optional.ofNullable(this.status);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetCertificateResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String arn;
        private @Nullable String id;
        private @Nullable CertificateStatus status;

        public Builder() {
    	      // Empty
        }

        public Builder(GetCertificateResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.id = defaults.id;
    	      this.status = defaults.status;
        }

        public Builder setArn(@Nullable String arn) {
            this.arn = arn;
            return this;
        }

        public Builder setId(@Nullable String id) {
            this.id = id;
            return this;
        }

        public Builder setStatus(@Nullable CertificateStatus status) {
            this.status = status;
            return this;
        }

        public GetCertificateResult build() {
            return new GetCertificateResult(arn, id, status);
        }
    }
}
