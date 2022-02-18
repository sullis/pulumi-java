// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.certificates.k8s.io_v1beta1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * This information is immutable after the request is created. Only the Request and Usages fields can be set on creation, other fields are derived by Kubernetes and cannot be modified by users.
 * 
 */
public final class CertificateSigningRequestSpecArgs extends io.pulumi.resources.ResourceArgs {

    public static final CertificateSigningRequestSpecArgs Empty = new CertificateSigningRequestSpecArgs();

    /**
     * Extra information about the requesting user. See user.Info interface for details.
     * 
     */
    @InputImport(name="extra")
    private final @Nullable Input<Map<String,List<String>>> extra;

    public Input<Map<String,List<String>>> getExtra() {
        return this.extra == null ? Input.empty() : this.extra;
    }

    /**
     * Group information about the requesting user. See user.Info interface for details.
     * 
     */
    @InputImport(name="groups")
    private final @Nullable Input<List<String>> groups;

    public Input<List<String>> getGroups() {
        return this.groups == null ? Input.empty() : this.groups;
    }

    /**
     * Base64-encoded PKCS#10 CSR data
     * 
     */
    @InputImport(name="request", required=true)
    private final Input<String> request;

    public Input<String> getRequest() {
        return this.request;
    }

    /**
     * Requested signer for the request. It is a qualified name in the form: `scope-hostname.io/name`. If empty, it will be defaulted:
     *  1. If it's a kubelet client certificate, it is assigned
     *     "kubernetes.io/kube-apiserver-client-kubelet".
     *  2. If it's a kubelet serving certificate, it is assigned
     *     "kubernetes.io/kubelet-serving".
     *  3. Otherwise, it is assigned "kubernetes.io/legacy-unknown".
     *     Distribution of trust for signers happens out of band. You can select on this field using `spec.signerName`.
     * 
     */
    @InputImport(name="signerName")
    private final @Nullable Input<String> signerName;

    public Input<String> getSignerName() {
        return this.signerName == null ? Input.empty() : this.signerName;
    }

    /**
     * UID information about the requesting user. See user.Info interface for details.
     * 
     */
    @InputImport(name="uid")
    private final @Nullable Input<String> uid;

    public Input<String> getUid() {
        return this.uid == null ? Input.empty() : this.uid;
    }

    /**
     * allowedUsages specifies a set of usage contexts the key will be valid for. See: https://tools.ietf.org/html/rfc5280#section-4.2.1.3
     *      https://tools.ietf.org/html/rfc5280#section-4.2.1.12
     * 
     */
    @InputImport(name="usages")
    private final @Nullable Input<List<String>> usages;

    public Input<List<String>> getUsages() {
        return this.usages == null ? Input.empty() : this.usages;
    }

    /**
     * Information about the requesting user. See user.Info interface for details.
     * 
     */
    @InputImport(name="username")
    private final @Nullable Input<String> username;

    public Input<String> getUsername() {
        return this.username == null ? Input.empty() : this.username;
    }

    public CertificateSigningRequestSpecArgs(
        @Nullable Input<Map<String,List<String>>> extra,
        @Nullable Input<List<String>> groups,
        Input<String> request,
        @Nullable Input<String> signerName,
        @Nullable Input<String> uid,
        @Nullable Input<List<String>> usages,
        @Nullable Input<String> username) {
        this.extra = extra;
        this.groups = groups;
        this.request = Objects.requireNonNull(request, "expected parameter 'request' to be non-null");
        this.signerName = signerName;
        this.uid = uid;
        this.usages = usages;
        this.username = username;
    }

    private CertificateSigningRequestSpecArgs() {
        this.extra = Input.empty();
        this.groups = Input.empty();
        this.request = Input.empty();
        this.signerName = Input.empty();
        this.uid = Input.empty();
        this.usages = Input.empty();
        this.username = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CertificateSigningRequestSpecArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Map<String,List<String>>> extra;
        private @Nullable Input<List<String>> groups;
        private Input<String> request;
        private @Nullable Input<String> signerName;
        private @Nullable Input<String> uid;
        private @Nullable Input<List<String>> usages;
        private @Nullable Input<String> username;

        public Builder() {
    	      // Empty
        }

        public Builder(CertificateSigningRequestSpecArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.extra = defaults.extra;
    	      this.groups = defaults.groups;
    	      this.request = defaults.request;
    	      this.signerName = defaults.signerName;
    	      this.uid = defaults.uid;
    	      this.usages = defaults.usages;
    	      this.username = defaults.username;
        }

        public Builder setExtra(@Nullable Input<Map<String,List<String>>> extra) {
            this.extra = extra;
            return this;
        }

        public Builder setExtra(@Nullable Map<String,List<String>> extra) {
            this.extra = Input.ofNullable(extra);
            return this;
        }

        public Builder setGroups(@Nullable Input<List<String>> groups) {
            this.groups = groups;
            return this;
        }

        public Builder setGroups(@Nullable List<String> groups) {
            this.groups = Input.ofNullable(groups);
            return this;
        }

        public Builder setRequest(Input<String> request) {
            this.request = Objects.requireNonNull(request);
            return this;
        }

        public Builder setRequest(String request) {
            this.request = Input.of(Objects.requireNonNull(request));
            return this;
        }

        public Builder setSignerName(@Nullable Input<String> signerName) {
            this.signerName = signerName;
            return this;
        }

        public Builder setSignerName(@Nullable String signerName) {
            this.signerName = Input.ofNullable(signerName);
            return this;
        }

        public Builder setUid(@Nullable Input<String> uid) {
            this.uid = uid;
            return this;
        }

        public Builder setUid(@Nullable String uid) {
            this.uid = Input.ofNullable(uid);
            return this;
        }

        public Builder setUsages(@Nullable Input<List<String>> usages) {
            this.usages = usages;
            return this;
        }

        public Builder setUsages(@Nullable List<String> usages) {
            this.usages = Input.ofNullable(usages);
            return this;
        }

        public Builder setUsername(@Nullable Input<String> username) {
            this.username = username;
            return this;
        }

        public Builder setUsername(@Nullable String username) {
            this.username = Input.ofNullable(username);
            return this;
        }

        public CertificateSigningRequestSpecArgs build() {
            return new CertificateSigningRequestSpecArgs(extra, groups, request, signerName, uid, usages, username);
        }
    }
}
